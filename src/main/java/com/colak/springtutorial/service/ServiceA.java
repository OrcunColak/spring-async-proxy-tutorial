package com.colak.springtutorial.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class ServiceA implements ServiceAInterface {

    @Override
    @Async("taskAsyncExecutor")
    public CompletableFuture<Void> methodA() {
        return CompletableFuture.completedFuture(null);
    }

    @Async("taskAsyncExecutor")
    public CompletableFuture<Void> methodX() {
        return CompletableFuture.completedFuture(null);
    }
}
