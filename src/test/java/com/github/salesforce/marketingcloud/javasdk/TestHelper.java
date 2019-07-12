package com.github.salesforce.marketingcloud.javasdk;

import com.github.salesforce.marketingcloud.javasdk.model.AccessTokenResponse;

import java.time.LocalDateTime;
import java.time.Month;

public class TestHelper {

    public static AccessTokenResponse createAccessTokenResponse()
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

    public static SettableDateTimeProvider createSettableDateTimeProvider()
    {
        return new SettableDateTimeProvider(LocalDateTime.of(
                2000, Month.JANUARY, 1, 0, 0)
        );
    }
}
