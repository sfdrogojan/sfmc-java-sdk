package com.github.salesforce.marketingcloud.javasdk.auth;

import com.github.salesforce.marketingcloud.javasdk.ApiException;
import com.github.salesforce.marketingcloud.javasdk.api.ApiTest;
import com.github.salesforce.marketingcloud.javasdk.model.AccessTokenResponse;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class OAuth2AuthenticatorTests extends ApiTest {
    @Before
    public void setup()
    {
        OAuth2Authenticator.reset();
    }

    @Test
    public void shouldReturnTokenResponseOnValidCredentials() throws ApiException {
        OAuth2Authenticator oAuth2Authenticator = new OAuth2Authenticator(
                new ClientCredentials(this.authBasePath, this.clientId, this.clientSecret, this.accountId, this.scope));

        AccessTokenResponse tokenResponse = oAuth2Authenticator.getTokenResponse();

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

        OAuth2Authenticator oAuth2Authenticator = new OAuth2Authenticator(
                new ClientCredentials(this.authBasePath, "invalid client id", this.clientSecret, this.accountId, this.scope));

        oAuth2Authenticator.getTokenResponse();
    }

    @Test
    public void shouldThrowApiExceptionOnInvalidClientSecret() throws ApiException {
        exceptionRule.expect(ApiException.class);
        exceptionRule.expectMessage("Unauthorized");

        OAuth2Authenticator oAuth2Authenticator = new OAuth2Authenticator(
                new ClientCredentials(this.authBasePath, this.clientId, "invalid client secret", this.accountId, this.scope));

        oAuth2Authenticator.getTokenResponse();
    }
}
