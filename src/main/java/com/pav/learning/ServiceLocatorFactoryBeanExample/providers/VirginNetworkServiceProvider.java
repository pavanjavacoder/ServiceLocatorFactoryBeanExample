package com.pav.learning.ServiceLocatorFactoryBeanExample.providers;

import org.springframework.stereotype.Component;

@Component("VIRGINMEDIA")
public class VirginNetworkServiceProvider implements NetworkServiceProvider {
    @Override
    public String getServiceProviderName() {
        return "Virgin Media";
    }
}
