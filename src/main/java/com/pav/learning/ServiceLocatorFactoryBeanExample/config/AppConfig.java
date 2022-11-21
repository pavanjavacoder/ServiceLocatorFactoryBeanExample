package com.pav.learning.ServiceLocatorFactoryBeanExample.config;

import com.pav.learning.ServiceLocatorFactoryBeanExample.providers.NetworkServiceProviderFactory;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ServiceLocatorFactoryBean configureNetworkServiceLocator() {
        ServiceLocatorFactoryBean serviceLocatorFactoryBean = new ServiceLocatorFactoryBean();
        serviceLocatorFactoryBean.setServiceLocatorInterface(NetworkServiceProviderFactory.class);
        return serviceLocatorFactoryBean;
    }
}
