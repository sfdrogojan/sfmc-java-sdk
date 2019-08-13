package com.github.salesforce.marketingcloud.javasdk.api;

import com.github.salesforce.marketingcloud.javasdk.ConfigProvider;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ApiSutFactory<T> {
    public T create() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName(type.getName());
        Constructor<?> constructor = c.getConstructor(String.class, String.class, String.class, String.class, String.class);

        ConfigProvider configProvider = new ConfigProvider();

        return (T) constructor.newInstance(
                configProvider.getAuthBasePath(),
                configProvider.getClientId(),
                configProvider.getClientSecret(),
                configProvider.getAccountId(),
                configProvider.getScope()
        );
    }

    private final Class<T> type;

    public ApiSutFactory(Class<T> type) {
        this.type = type;
    }
}
