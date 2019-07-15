package com.github.salesforce.marketingcloud.javasdk.auth;

import com.github.salesforce.marketingcloud.javasdk.*;
import com.github.salesforce.marketingcloud.javasdk.model.AccessTokenResponse;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.mockito.Mockito.*;

public class AuthServiceUnitTest {
    @Before
    public void setup() { CacheService.cache.clear(); }

    @After
    public void tearDown()
    {
        CacheService.cache.clear();
    }

    @Test
    public void tokenApiIsCalledOnEmptyCache() throws ApiException {
        ClientConfig clientConfig = TestHelper.createClientConfig();
        AccessTokenResponse accessTokenResponse = TestHelper.createAccessTokenResponse();
        ApiClient apiClientMock = createApiClientMock(accessTokenResponse);
        AuthService authService = new AuthService(clientConfig, apiClientMock, new CacheService(new DateTimeProvider()));

        authService.getTokenResponse();

        verify(apiClientMock, times(1)).execute(any(), eq(AccessTokenResponse.class));
    }

    @Test
    public void tokenApiIsCalledOnExpiredCache() throws ApiException {
        ClientConfig clientConfig = TestHelper.createClientConfig();
        AccessTokenResponse accessTokenResponse = TestHelper.createAccessTokenResponse();
        ApiClient apiClientMock = createApiClientMock(accessTokenResponse);
        SettableDateTimeProvider settableDateTimeProvider = TestHelper.createSettableDateTimeProvider();
        AuthService authService = new AuthService(clientConfig, apiClientMock, new CacheService(settableDateTimeProvider));

        authService.getTokenResponse();
        settableDateTimeProvider.setCurrentDate(settableDateTimeProvider.getCurrentDate().plusMinutes(20));
        authService.getTokenResponse();

        verify(apiClientMock, times(2)).execute(any(), eq(AccessTokenResponse.class));
    }

    @Test
    public void tokenApiIsCalledOnlyOnceForMultipleInstances() throws ApiException {
        ClientConfig clientConfig = TestHelper.createClientConfig();
        AccessTokenResponse accessTokenResponse = TestHelper.createAccessTokenResponse();
        ApiClient apiClientMock = createApiClientMock(accessTokenResponse);

        AuthService authServiceInstance1 = new AuthService(clientConfig, apiClientMock, new CacheService(new DateTimeProvider()));
        authServiceInstance1.getTokenResponse();
        AuthService authServiceInstance2 = new AuthService(clientConfig, apiClientMock, new CacheService(new DateTimeProvider()));
        authServiceInstance2.getTokenResponse();

        verify(apiClientMock, times(1)).execute(any(), eq(AccessTokenResponse.class));
    }

    private ApiClient createApiClientMock(AccessTokenResponse accessTokenResponse) throws ApiException {
        ApiClient apiClientMock = mock(ApiClient.class);
        when(apiClientMock.getJSON()).thenReturn(new JSON());
        when(apiClientMock.getHttpClient()).thenReturn(new OkHttpClient());
        when(apiClientMock.execute(any(Call.class), eq(AccessTokenResponse.class)))
                .thenReturn(new ApiResponse<>(
                        200, new HashMap<>(), accessTokenResponse
                        )
                );
        return apiClientMock;
    }
}
