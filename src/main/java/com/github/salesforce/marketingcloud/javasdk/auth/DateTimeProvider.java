package com.github.salesforce.marketingcloud.javasdk.auth;

import java.time.LocalDateTime;

public interface DateTimeProvider {
    LocalDateTime getCurrentDate();
}
