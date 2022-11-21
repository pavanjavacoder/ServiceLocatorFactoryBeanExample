package com.pav.learning.ServiceLocatorFactoryBeanExample.providers;

import org.springframework.stereotype.Component;

@Component("BTNETWORK")
public class BTNetworkServiceProvider implements NetworkServiceProvider {
    @Override
    public String getServiceProviderName() {
        return "British Telecom";
    }
}
