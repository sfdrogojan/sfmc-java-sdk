package com.github.salesforce.marketingcloud.javasdk.auth;

import com.github.salesforce.marketingcloud.javasdk.ApiException;
import com.github.salesforce.marketingcloud.javasdk.model.AccessTokenResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.squareup.okhttp.*;

import java.io.IOException;

public class OAuth2Authenticator {
    private String authBasePath;
    private String clientId;
    private String clientSecret;
    private String accountId;
    private String scope;
    private AccessTokenResponse accessTokenResponse;
    private long tokenExpirationTime = 0;

    public OAuth2Authenticator(String authBasePath, String clientId, String clientSecret, String accountId, String scope) {
        // TODO - set user agent
        this.authBasePath = authBasePath;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.accountId = accountId;
        this.scope = scope;
    }

    public AccessTokenResponse getTokenResponse() throws ApiException {
        if (tokenExpirationTime > 0) {
            if (tokenExpirationTime - System.currentTimeMillis() > 5*60*1000) {
                return accessTokenResponse;
            }
        }

        OkHttpClient httpClient = new OkHttpClient();

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

        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        String requestPayload = gson.toJson(jsonObject);

        RequestBody body = RequestBody.create(
                MediaType.parse("application/json"), requestPayload
        );

        Request request = new Request.Builder()
                .url(authBasePath + "/v2/token")
                .post(body)
                .build();

        try {
            Response response = httpClient.newCall(request).execute();
            accessTokenResponse = gson.fromJson(response.body().string(), AccessTokenResponse.class);
            tokenExpirationTime = System.currentTimeMillis() + (accessTokenResponse.getExpiresIn() * 1000);
        } catch (IOException e) {
            throw new ApiException(e);
        }

        return accessTokenResponse;
    }
}
