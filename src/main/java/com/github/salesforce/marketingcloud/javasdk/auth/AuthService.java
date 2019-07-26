package com.github.salesforce.marketingcloud.javasdk.auth;

import com.github.salesforce.marketingcloud.javasdk.ApiClient;
import com.github.salesforce.marketingcloud.javasdk.ApiException;
import com.github.salesforce.marketingcloud.javasdk.ApiResponse;
import com.github.salesforce.marketingcloud.javasdk.model.TokenResponse;
import com.google.gson.JsonObject;
import com.squareup.okhttp.*;

public class AuthService {
    private final ClientConfig clientConfig;
    private final ApiClient apiClient;
    private final CacheService cacheService;

    public AuthService(ClientConfig clientConfig, ApiClient apiClient, CacheService cacheService) {
        this.clientConfig = clientConfig;
        this.apiClient = apiClient;
        this.cacheService = cacheService;
    }

    public TokenResponse getTokenResponse() throws ApiException {
        String cacheKey = this.getCacheKey();
        TokenResponse cachedTokenResponse = this.cacheService.get(cacheKey);

        if(cachedTokenResponse == null) {
            String authBasePath = removeUrlTrailingSlash(this.clientConfig.getAuthBasePath());
            this.apiClient.setBasePath(authBasePath);

            String requestPayload = getTokenRequestPayload();

            RequestBody body = RequestBody.create(
                    MediaType.parse("application/json"), requestPayload
            );

            Request request = new Request.Builder()
                    .url(authBasePath + "/v2/token")
                    .post(body)
                    .build();

            Call tokenCall = this.apiClient.getHttpClient().newCall(request);
            ApiResponse<TokenResponse> response = this.apiClient.execute(tokenCall, TokenResponse.class);
            TokenResponse tokenResponse = response.getData();

            this.sanitizeUrls(tokenResponse);
            this.cacheService.addOrUpdate(cacheKey, tokenResponse);

            return tokenResponse;
        }
        else
        {
            return cachedTokenResponse;
        }
    }

    private String getTokenRequestPayload() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("client_id", this.clientConfig.getClientId());
        jsonObject.addProperty("client_secret", this.clientConfig.getClientSecret());
        jsonObject.addProperty("grant_type", "client_credentials");
        String accountId = this.clientConfig.getAccountId();
        if (accountId != null && accountId.length() > 0) {
            jsonObject.addProperty("account_id", accountId);
        }
        String scope = this.clientConfig.getScope();
        if (scope != null && scope.length() > 0) {
            jsonObject.addProperty("scope", scope);
        }

        return this.apiClient.getJSON().getGson().toJson(jsonObject);
    }

    private String getCacheKey()
    {
        return this.clientConfig.getClientId() + "-" + this.clientConfig.getAccountId();
    }

    private String removeUrlTrailingSlash(String url)
    {
        if(url.endsWith("/")) {
            return url.substring(0, url.length() - 1);
        }
        return url;
    }

    private void sanitizeUrls(TokenResponse tokenResponse)
    {
        tokenResponse.setRestInstanceUrl(removeUrlTrailingSlash(tokenResponse.getRestInstanceUrl()));
        tokenResponse.setSoapInstanceUrl(removeUrlTrailingSlash(tokenResponse.getSoapInstanceUrl()));
    }
}
