package com.github.salesforce.marketingcloud.javasdk.auth;

import com.github.salesforce.marketingcloud.javasdk.ApiException;
import com.github.salesforce.marketingcloud.javasdk.model.AccessTokenResponse;

public interface IAuthService {
    AccessTokenResponse getTokenResponse() throws ApiException;
}
