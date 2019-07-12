package com.github.salesforce.marketingcloud.javasdk.auth;

import com.github.salesforce.marketingcloud.javasdk.DateTimeProvider;
import com.github.salesforce.marketingcloud.javasdk.model.AccessTokenResponse;
import javafx.util.Pair;

import java.time.LocalDateTime;
import java.util.concurrent.ConcurrentHashMap;

public class CacheService {
    private final DateTimeProvider dateTimeProvider;
    static ConcurrentHashMap<String, Pair<AccessTokenResponse, LocalDateTime>> cache;
    private final int invalidCacheWindowInSeconds = 5 * 60;

    static {
        cache = new ConcurrentHashMap<>();
    }

    public CacheService(DateTimeProvider dateTimeProvider)
    {
        this.dateTimeProvider = dateTimeProvider;
    }

    public AccessTokenResponse get(String key) {
        if(cache.containsKey(key)){
            Pair<AccessTokenResponse, LocalDateTime> cachedPair = cache.get(key);
            if(cachedPair.getValue().isAfter(dateTimeProvider.getCurrentDate()))
            {
                return cachedPair.getKey();
            }
        }
        return null;
    }

    public void addOrUpdate(String key, AccessTokenResponse value) {
        LocalDateTime expirationDate =
                this.dateTimeProvider.getCurrentDate().plusSeconds(value.getExpiresIn() - invalidCacheWindowInSeconds);
        cache.put(key, new Pair<>(value, expirationDate));
    }
}
