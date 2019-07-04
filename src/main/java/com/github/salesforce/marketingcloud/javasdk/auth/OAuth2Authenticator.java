package com.github.salesforce.marketingcloud.javasdk.auth;

import com.github.salesforce.marketingcloud.javasdk.ApiClient;
import com.github.salesforce.marketingcloud.javasdk.ApiException;
import com.github.salesforce.marketingcloud.javasdk.ApiResponse;
import com.github.salesforce.marketingcloud.javasdk.model.AccessTokenResponse;
import com.google.gson.JsonObject;
import com.squareup.okhttp.*;

public class OAuth2Authenticator {
    private String authBasePath;
    private String clientId;
    private String clientSecret;
    private String accountId;
    private String scope;
    private static AccessTokenResponse accessTokenResponse;
    private static long tokenExpirationTime = 0;

    public OAuth2Authenticator(ClientCredentials clientCredentials) {
        this.authBasePath = clientCredentials.getAuthBasePath();
        this.clientId = clientCredentials.getClientId();
        this.clientSecret = clientCredentials.getClientSecret();
        this.accountId = clientCredentials.getAccountId();
        this.scope = clientCredentials.getScope();
    }

    static void reset()
    {
        tokenExpirationTime = 0;
        accessTokenResponse = null;
    }

    public AccessTokenResponse getTokenResponse() throws ApiException {

        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(authBasePath);

        if (tokenExpirationTime > 0) {
            if (tokenExpirationTime - System.currentTimeMillis() > 5*60*1000) {
                return accessTokenResponse;
            }
        }

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("client_id", clientId);
        jsonObject.addProperty("client_secret", clientSecret);
        jsonObject.addProperty("grant_type", "client_credentials");
        if(accountId != null && accountId.length() > 0)
        {
            jsonObject.addProperty("account_id", accountId);
        }
        if(scope != null && scope.length() > 0)
        {
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
        accessTokenResponse = response.getData();
        tokenExpirationTime = System.currentTimeMillis() + (accessTokenResponse.getExpiresIn() * 1000);

        return this.accessTokenResponse;
    }
}
