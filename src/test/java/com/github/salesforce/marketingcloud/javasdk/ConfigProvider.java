package com.github.salesforce.marketingcloud.javasdk;

public class ConfigProvider {
    private static String authBasePath;
    private static String clientId;
    private static String clientSecret;
    private static String accountId;
    private static String scope;
    private static String shortCode;
    private static String keyword;

    public String getAuthBasePath() {
        if(authBasePath == null) {
            authBasePath = System.getenv("SFMC_AUTH_BASE_PATH");
        }
        return authBasePath;
    }

    public String getClientId() {
        if(clientId == null) {
            clientId = System.getenv("SFMC_CLIENT_ID");
        }
        return clientId;
    }

    public String getClientSecret() {
        if(clientSecret == null) {
            clientSecret = System.getenv("SFMC_CLIENT_SECRET");
        }
        return clientSecret;
    }

    public String getAccountId() {
        if(accountId == null) {
            accountId = System.getenv("SFMC_ACCOUNT_ID");
        }
        return accountId;
    }

    public String getScope() {
        if(scope == null) {
            scope = System.getenv("SFMC_SCOPE");
        }
        return scope;
    }

    public String getShortCode() {
        if(shortCode == null) {
            shortCode = System.getenv("SFMC_SHORT_CODE");
        }
        return shortCode;
    }

    public String getKeyword() {
        if(keyword == null) {
            keyword = System.getenv("SFMC_KEYWORD");
        }
        return keyword;
    }
}
