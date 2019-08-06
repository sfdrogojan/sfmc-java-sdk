package com.github.salesforce.marketingcloud.javasdk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RuntimeInformationProviderTest {
    @Test
    public void shouldContainJavaVersion()
    {
        RuntimeInformationProvider runtimeInformationProvider = new RuntimeInformationProvider();
        String result = runtimeInformationProvider.getForUserAgentString();

        assertTrue(result.contains("java.version="));
    }

    @Test
    public void shouldContainOSName()
    {
        RuntimeInformationProvider runtimeInformationProvider = new RuntimeInformationProvider();
        String result = runtimeInformationProvider.getForUserAgentString();

        assertTrue(result.contains("os.name="));
    }

    @Test
    public void shouldContainOSVersion()
    {
        RuntimeInformationProvider runtimeInformationProvider = new RuntimeInformationProvider();
        String result = runtimeInformationProvider.getForUserAgentString();

        assertTrue(result.contains("os.version="));
    }

    @Test
    public void shouldDefaultToNAWhenNotAccessibleDueToSecurity()
    {
        try {
            System.setSecurityManager(new SecurityManager() {
                @Override
                public void checkPropertyAccess(String key) {
                    throw new SecurityException("not allowed");
                }
            });

            RuntimeInformationProvider runtimeInformationProvider = new RuntimeInformationProvider();
            String result = runtimeInformationProvider.getForUserAgentString();

            assertEquals("/NA", result);
        }
        finally {
            System.setSecurityManager(null);
        }
    }
}
