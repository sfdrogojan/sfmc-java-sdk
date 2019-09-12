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
}
