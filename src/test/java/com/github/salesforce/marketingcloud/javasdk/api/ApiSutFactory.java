package com.github.salesforce.marketingcloud.javasdk.api;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ApiSutFactory<T> {

    private static String authBasePath;
    private static String clientId;
    private static String clientSecret;
    private static String accountId;
    private static String scope;

    T create() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName(type.getName());
        Constructor<?> constructor = c.getConstructor(String.class, String.class, String.class, String.class, String.class);

        return (T) constructor.newInstance(authBasePath, clientId, clientSecret, accountId, scope);
    }

    private final Class<T> type;

    public ApiSutFactory(Class<T> type) {
        this.type = type;
        if(authBasePath == null) {
            authBasePath = System.getenv("SFMC_AUTH_BASE_PATH");
        }
        if(clientId == null) {
            clientId = System.getenv("SFMC_CLIENT_ID");
        }
        if(clientSecret == null) {
            clientSecret = System.getenv("SFMC_CLIENT_SECRET");
        }
        if(accountId == null) {
            accountId = System.getenv("SFMC_ACCOUNT_ID");
        }
        if(scope == null) {
            scope = System.getenv("SFMC_SCOPE");
        }
    }
}
