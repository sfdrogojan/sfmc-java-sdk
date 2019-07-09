package com.github.salesforce.marketingcloud.javasdk.auth;

import com.github.salesforce.marketingcloud.javasdk.ApiClient;
import com.github.salesforce.marketingcloud.javasdk.ApiException;
import com.github.salesforce.marketingcloud.javasdk.ApiResponse;
import com.github.salesforce.marketingcloud.javasdk.model.AccessTokenResponse;
import com.google.gson.JsonObject;
import com.squareup.okhttp.*;

public class AuthService implements IAuthService {
    private final ClientConfig clientConfig;
    private final ApiClient apiClient;
    private final ICacheService cacheService;

    public AuthService(ClientConfig clientConfig, ApiClient apiClient, ICacheService cacheService) {
        this.clientConfig = clientConfig;
        this.apiClient = apiClient;
        this.cacheService = cacheService;
    }

    @Override
    public AccessTokenResponse getTokenResponse() throws ApiException {
        String cacheKey = this.getCacheKey();
        AccessTokenResponse cachedAccessTokenResponse = this.cacheService.get(cacheKey);

        if(cachedAccessTokenResponse == null) {

            String authBasePath = this.clientConfig.getAuthBasePath();
            apiClient.setBasePath(authBasePath);

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

            String requestPayload = apiClient.getJSON().getGson().toJson(jsonObject);

            RequestBody body = RequestBody.create(
                    MediaType.parse("application/json"), requestPayload
            );

            Request request = new Request.Builder()
                    .url(authBasePath + "/v2/token")
                    .post(body)
                    .build();

            Call tokenCall = apiClient.getHttpClient().newCall(request);
            ApiResponse<AccessTokenResponse> response = apiClient.execute(tokenCall, AccessTokenResponse.class);
            AccessTokenResponse accessTokenResponse = response.getData();

            this.cacheService.addOrUpdate(cacheKey, accessTokenResponse);

            return accessTokenResponse;
        }
        else
        {
            return cachedAccessTokenResponse;
        }
    }

    private String getCacheKey()
    {
        return this.clientConfig.getClientId() + "-" + this.clientConfig.getAccountId();
    }
}
