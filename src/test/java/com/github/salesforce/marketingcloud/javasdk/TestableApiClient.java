package com.github.salesforce.marketingcloud.javasdk;

import com.github.salesforce.marketingcloud.javasdk.ApiClient;
import com.github.salesforce.marketingcloud.javasdk.ApiException;
import com.github.salesforce.marketingcloud.javasdk.ApiResponse;
import com.squareup.okhttp.Call;

import java.lang.reflect.Type;

public class TestableApiClient extends ApiClient {
    private int timesExecuteWasCalled;

    public int getTimesExecuteWasCalled() {
        return timesExecuteWasCalled;
    }

    @Override
    public <T> ApiResponse<T> execute(Call call, Type returnType) throws ApiException {
        timesExecuteWasCalled += 1;
        return super.execute(call, returnType);
    }
}
