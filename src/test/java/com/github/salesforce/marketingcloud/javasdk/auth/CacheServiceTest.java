package com.github.salesforce.marketingcloud.javasdk.auth;

import com.github.salesforce.marketingcloud.javasdk.model.AccessTokenResponse;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class CacheServiceTest {

    private String cacheKey = "cacheKey";

    @After
    public void TearDown()
    {
        CacheService.cache.clear();
    }

    @Test
    public void get_WhenKeyNotPresent_ReturnsNull() {
        CacheService cacheService = new CacheService(new DefaultDateTimeProvider());
        assertNull(cacheService.get(cacheKey));
    }

    @Test
    public void get_WhenCacheIsNotExpired_ReturnsCachedValue() {
        CacheService cacheService = new CacheService(new DefaultDateTimeProvider());
        AccessTokenResponse accessTokenResponse = CreateAccessTokenResponse();
        cacheService.addOrUpdate(cacheKey, accessTokenResponse);

        AccessTokenResponse cachedAccessTokenResponse = cacheService.get(cacheKey);

        assertNotNull(cachedAccessTokenResponse);
        assertEquals(accessTokenResponse.getAccessToken(), cachedAccessTokenResponse.getAccessToken());
        assertEquals(accessTokenResponse.getTokenType(), cachedAccessTokenResponse.getTokenType());
        assertEquals(accessTokenResponse.getExpiresIn(), cachedAccessTokenResponse.getExpiresIn());
        assertEquals(accessTokenResponse.getRestInstanceUrl(), cachedAccessTokenResponse.getRestInstanceUrl());
        assertEquals(accessTokenResponse.getSoapInstanceUrl(), cachedAccessTokenResponse.getSoapInstanceUrl());
        assertEquals(accessTokenResponse.getScope(), cachedAccessTokenResponse.getScope());
    }

    @Test
    public void get_WhenCacheIsExpired_ReturnsNull() {
        DefaultDateTimeProvider dateTimeProvider = new DefaultDateTimeProvider();
        CacheService cacheService = new CacheService(dateTimeProvider);
        AccessTokenResponse accessTokenResponse = CreateAccessTokenResponse();
        cacheService.addOrUpdate(cacheKey, accessTokenResponse);

        long currentTime = dateTimeProvider.getCurrentDate().getTime();
        currentTime += 20 * 60 * 1000;
        dateTimeProvider.getCurrentDate().setTime(currentTime);

        AccessTokenResponse cachedAccessTokenResponse = cacheService.get(cacheKey);

        assertNull(cachedAccessTokenResponse);
    }

    @Test
    public void addOrUpdate_WhenCalledTwoTimesForTheSameKey_OverwritesCachedValue() {
        DefaultDateTimeProvider dateTimeProvider = new DefaultDateTimeProvider();
        CacheService cacheService = new CacheService(dateTimeProvider);
        AccessTokenResponse accessTokenResponse = CreateAccessTokenResponse();

        cacheService.addOrUpdate(cacheKey, accessTokenResponse);

        AccessTokenResponse newAccessTokenResponse = CreateAccessTokenResponse();
        cacheService.addOrUpdate(cacheKey, newAccessTokenResponse);

        AccessTokenResponse cachedAccessTokenResponse = cacheService.get(cacheKey);

        assertEquals(cachedAccessTokenResponse, newAccessTokenResponse);
    }

    //TODO - add parameterized tests for invalid cache window

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