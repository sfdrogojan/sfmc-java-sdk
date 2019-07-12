package com.github.salesforce.marketingcloud.javasdk.auth;

import com.github.salesforce.marketingcloud.javasdk.SettableDateTimeProvider;
import com.github.salesforce.marketingcloud.javasdk.TestHelper;
import com.github.salesforce.marketingcloud.javasdk.model.AccessTokenResponse;
import org.junit.After;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class CacheServiceTest {

    private String cacheKey = "cacheKey";

    @After
    public void tearDown()
    {
        CacheService.cache.clear();
    }

    @Test
    public void get_WhenKeyNotPresent_ReturnsNull() {
        CacheService cacheService = new CacheService(TestHelper.createSettableDateTimeProvider());
        assertNull(cacheService.get(cacheKey));
    }

    @Test
    public void get_WhenCacheIsNotExpired_ReturnsCachedValue() {
        CacheService cacheService = new CacheService(TestHelper.createSettableDateTimeProvider());
        AccessTokenResponse accessTokenResponse = TestHelper.createAccessTokenResponse();
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
        SettableDateTimeProvider dateTimeProvider = TestHelper.createSettableDateTimeProvider();
        CacheService cacheService = new CacheService(dateTimeProvider);
        AccessTokenResponse accessTokenResponse = TestHelper.createAccessTokenResponse();
        cacheService.addOrUpdate(cacheKey, accessTokenResponse);

        LocalDateTime currentDateTime = dateTimeProvider.getCurrentDate();
        LocalDateTime expiredCacheDateTime = currentDateTime.plusMinutes(20);
        dateTimeProvider.setCurrentDate(expiredCacheDateTime);

        AccessTokenResponse cachedAccessTokenResponse = cacheService.get(cacheKey);

        assertNull(cachedAccessTokenResponse);
    }

    @Test
    public void addOrUpdate_WhenCalledTwoTimesForTheSameKey_OverwritesCachedValue() {
        SettableDateTimeProvider dateTimeProvider = TestHelper.createSettableDateTimeProvider();
        CacheService cacheService = new CacheService(dateTimeProvider);
        AccessTokenResponse accessTokenResponse = TestHelper.createAccessTokenResponse();

        cacheService.addOrUpdate(cacheKey, accessTokenResponse);

        AccessTokenResponse newAccessTokenResponse = TestHelper.createAccessTokenResponse();
        cacheService.addOrUpdate(cacheKey, newAccessTokenResponse);

        AccessTokenResponse cachedAccessTokenResponse = cacheService.get(cacheKey);

        assertEquals(cachedAccessTokenResponse, newAccessTokenResponse);
    }
}