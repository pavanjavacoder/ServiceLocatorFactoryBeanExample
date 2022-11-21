package com.pav.learning.ServiceLocatorFactoryBeanExample.controller;

import com.pav.learning.ServiceLocatorFactoryBeanExample.providers.NetworkServiceProviderFactory;
import com.pav.learning.ServiceLocatorFactoryBeanExample.providers.ProviderType;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/providers/")
@RequiredArgsConstructor
public class ServiceProviderSelectionController {

    private final NetworkServiceProviderFactory networkServiceProviderFactory;

    @GetMapping("provider/{providerName}")
    public String getProviderInfo(@PathVariable ProviderType providerName) {
        return networkServiceProviderFactory.getServiceProvider(providerName).getServiceProviderName();
    }

}
