package com.github.salesforce.marketingcloud.javasdk.api;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ApiSutFactory<T> {
    T create() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName(type.getName());
        Constructor<?> constructor = c.getConstructor(String.class, String.class, String.class, String.class, String.class);

        String authBasePath = System.getenv("SFMC_AUTH_BASE_PATH");
        String clientId = System.getenv("SFMC_CLIENT_ID");
        String clientSecret = System.getenv("SFMC_CLIENT_SECRET");
        String acccuntId = System.getenv("SFMC_ACCOUNT_ID");
        String scope = System.getenv("SFMC_SCOPE");

        return (T) constructor.newInstance(authBasePath, clientId, clientSecret, acccuntId, scope);
    }

    private final Class<T> type;

    public ApiSutFactory(Class<T> type) {

        this.type = type;
    }
}
