package com.github.salesforce.marketingcloud.javasdk.auth;

import java.time.LocalDateTime;

public class DefaultDateTimeProvider implements DateTimeProvider {
    LocalDateTime date;

    public DefaultDateTimeProvider()
    {
        this.date = LocalDateTime.now();
    }

    @Override
    public LocalDateTime getCurrentDate() {
        return this.date;
    }
}
