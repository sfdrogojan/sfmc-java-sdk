package com.github.salesforce.marketingcloud.javasdk.auth;

import com.github.salesforce.marketingcloud.javasdk.model.AccessTokenResponse;

public interface ICacheService {
    AccessTokenResponse get(String key);
    void addOrUpdate(String key, AccessTokenResponse value);
}
