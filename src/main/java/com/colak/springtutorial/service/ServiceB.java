package com.colak.springtutorial.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ServiceB {

    // original bean injection
    // If we don't use @EnableAsync(proxyTargetClass = true), the problem is at runtime there is not bean of type ServiceA.
    // There is only a bean of type ServiceAInterface.
    // So you have to inject ServiceAInterface or tell Spring to use CGLIB proxy via proxyTargetClass = true
    private final ServiceA serviceA;

    public void methodB() {
        serviceA.methodX();
    }
}
