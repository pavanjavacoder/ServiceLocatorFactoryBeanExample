package com.pav.learning.ServiceLocatorFactoryBeanExample.providers;

public interface NetworkServiceProviderFactory {
    NetworkServiceProvider getServiceProvider(ProviderType providerType);
}
