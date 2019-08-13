package com.github.salesforce.marketingcloud.javasdk;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RuntimeInformationProviderTest {
    private RuntimeInformationProvider runtimeInformationProvider;

    @Before
    public void setup()
    {
        runtimeInformationProvider = new RuntimeInformationProvider();
    }

    @Test
    public void shouldContainJavaVersion()
    {
        String result = runtimeInformationProvider.getForUserAgentString();

        assertTrue(result.contains("java.version="));
    }

    @Test
    public void shouldContainOSName()
    {
        String result = runtimeInformationProvider.getForUserAgentString();

        assertTrue(result.contains("os.name="));
    }

    @Test
    public void shouldContainOSVersion()
    {
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

            String result = runtimeInformationProvider.getForUserAgentString();

            assertEquals("/NA", result);
        }
        finally {
            System.setSecurityManager(null);
        }
    }
}
