package com.github.salesforce.marketingcloud.javasdk.auth;

import com.github.salesforce.marketingcloud.javasdk.ApiClient;
import com.github.salesforce.marketingcloud.javasdk.ApiException;
import com.github.salesforce.marketingcloud.javasdk.api.ApiTest;
import com.github.salesforce.marketingcloud.javasdk.model.AccessTokenResponse;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class AuthServiceIntegrationTests extends ApiTest {
    private AuthService authService;
    private ClientConfig clientConfig;
    private ApiClient apiClient;
    private CacheService cacheService;

    @Before
    public void setup()
    {
        this.clientConfig = new ClientConfig(
                this.authBasePath, this.clientId, this.clientSecret, this.accountId, this.scope);
        this.apiClient = new ApiClient();
        this.cacheService = new CacheService(new DefaultDateTimeProvider());
    }

    @After()
    public void tearDown()
    {
        CacheService.cache.clear();
    }

    @Test
    public void shouldReturnTokenResponseOnValidCredentials() throws ApiException {
        this.authService = new AuthService(clientConfig, apiClient, cacheService);

        AccessTokenResponse tokenResponse = this.authService.getTokenResponse();

        assertNotNull(tokenResponse.getAccessToken());
        assertNotNull(tokenResponse.getTokenType());
        assertNotNull(tokenResponse.getRestInstanceUrl());
        assertNotNull(tokenResponse.getSoapInstanceUrl());
        assertNotNull(tokenResponse.getScope());
        assertTrue(tokenResponse.getExpiresIn() > 0);
    }

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();
    @Test
    public void shouldThrowApiExceptionOnInvalidClientId() throws ApiException {
        exceptionRule.expect(ApiException.class);
        exceptionRule.expectMessage("Unauthorized");

        this.clientConfig = new ClientConfig(
                this.authBasePath, "invalid", this.clientSecret, this.accountId, this.scope);
        this.authService = new AuthService(this.clientConfig, this.apiClient, this.cacheService);

        this.authService.getTokenResponse();
    }

    @Test
    public void shouldThrowApiExceptionOnInvalidClientSecret() throws ApiException {
        exceptionRule.expect(ApiException.class);
        exceptionRule.expectMessage("Unauthorized");

        this.clientConfig = new ClientConfig(
                this.authBasePath, this.clientId, "invalid", this.accountId, this.scope);
        this.authService = new AuthService(this.clientConfig, this.apiClient, this.cacheService);

        this.authService.getTokenResponse();
    }

    @Test
    public void shouldReturnTheSameAccessTokenResponseInstanceWhenCalledMultipleTimes() throws ApiException {
        this.authService = new AuthService(clientConfig, apiClient, cacheService);

        AccessTokenResponse tokenResponse1 = this.authService.getTokenResponse();
        AccessTokenResponse tokenResponse2 = this.authService.getTokenResponse();

        assertSame(tokenResponse1, tokenResponse2);
    }

    @Test
    public void shouldCallOnlyOneTimeTheApiClientExecuteMethodWhenMultipleInstancesAreUsed() throws ApiException {
        TestableApiClient testableApiClient = new TestableApiClient();
        AuthService authServiceInstance1 = new AuthService(clientConfig, testableApiClient, cacheService);
        AuthService authServiceInstance2 = new AuthService(clientConfig, testableApiClient, cacheService);

        authServiceInstance1.getTokenResponse();
        authServiceInstance2.getTokenResponse();

        assertEquals(1, testableApiClient.getTimesExecuteWasCalled());
    }
}
