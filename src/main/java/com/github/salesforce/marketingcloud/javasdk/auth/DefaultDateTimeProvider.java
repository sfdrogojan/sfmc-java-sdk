package com.github.salesforce.marketingcloud.javasdk.auth;

import java.util.Date;

public class DefaultDateTimeProvider implements DateTimeProvider {
    Date date;

    public DefaultDateTimeProvider()
    {
        this.date = new Date();
    }

    @Override
    public Date getCurrentDate() {
        return this.date;
    }
}
