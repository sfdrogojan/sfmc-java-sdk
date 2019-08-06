package com.github.salesforce.marketingcloud.javasdk;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class ApiClientTest {

    @Test
    public void shouldGetRuntimeInformation()
    {
        RuntimeInformationProvider runtimeInformationProviderMock = mock(RuntimeInformationProvider.class);

        new ApiClient(runtimeInformationProviderMock);

        verify(runtimeInformationProviderMock, times(1)).getForUserAgentString();
    }
}
