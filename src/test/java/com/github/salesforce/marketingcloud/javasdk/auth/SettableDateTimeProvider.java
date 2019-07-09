package com.github.salesforce.marketingcloud.javasdk.auth;

import java.time.LocalDateTime;

public class SettableDateTimeProvider implements DateTimeProvider {
    LocalDateTime localDateTime;

    public SettableDateTimeProvider(LocalDateTime localDateTime)
    {
        this.localDateTime = localDateTime;
    }

    @Override
    public LocalDateTime getCurrentDate() {
        return localDateTime;
    }

    public void setCurrentDate(LocalDateTime localDateTime)
    {
        this.localDateTime = localDateTime;
    }
}
