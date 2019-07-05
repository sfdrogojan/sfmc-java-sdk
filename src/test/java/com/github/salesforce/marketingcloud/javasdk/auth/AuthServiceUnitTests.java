package com.github.salesforce.marketingcloud.javasdk.auth;

import com.github.salesforce.marketingcloud.javasdk.ApiException;
import com.github.salesforce.marketingcloud.javasdk.ApiResponse;
import com.github.salesforce.marketingcloud.javasdk.IApiClient;
import com.github.salesforce.marketingcloud.javasdk.model.AccessTokenResponse;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Request;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class AuthServiceUnitTests {
    @Mock
    private IApiClient apiClientMock;

    @Test
    public void getTokenResponse_WhenCacheIsNotExpired_CallsOneTimeApiMethod() throws ApiException {

        AccessTokenResponse accessTokenResponse = CreateAccessTokenResponse();
        ApiResponse<AccessTokenResponse> apiResponse = new ApiResponse<AccessTokenResponse>(
                200,
                new HashMap<String, List<String>>(),
                accessTokenResponse)
        Mockito.when(
                apiClientMock
                .execute(Mockito.any(Call.class), AccessTokenResponse.class))
                .thenReturn(apiResponse);
        
        AuthService authServiceInstance1 = new AuthService(
                new ClientConfig("", "", "", "", ""),
                apiClientMock, new CacheService(new DefaultDateTimeProvider() {
            })
        );
        AuthService authServiceInstance2 = new AuthService(
                new ClientConfig("", "", "", "", ""),
                apiClientMock, new CacheService(new DefaultDateTimeProvider() {
        })
        );
    }

    private AccessTokenResponse CreateAccessTokenResponse()
    {
        AccessTokenResponse accessTokenResponse = new AccessTokenResponse();
        accessTokenResponse.setAccessToken("access_token");
        accessTokenResponse.setTokenType("token_type");
        accessTokenResponse.setExpiresIn(1000);
        accessTokenResponse.setRestInstanceUrl("https://rest.com");
        accessTokenResponse.setSoapInstanceUrl("https://soap.com");
        accessTokenResponse.setScope("scope");

        return accessTokenResponse;
    }
}