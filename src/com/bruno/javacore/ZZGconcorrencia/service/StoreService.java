package com.bruno.javacore.ZZGconcorrencia.service;

import java.util.concurrent.*;

public class StoreService {
    public static final ExecutorService ex = Executors.newCachedThreadPool();

    public double getPriceSync(String storeName) {
        System.out.printf("Getting oruces sync for store %s%n", storeName);
        return priceGenerator();
    }

    public Future<Double> getPricesAsyncFuture(String storeName) {
        System.out.printf("Getting oruces sync for store %s%n", storeName);
        Future<Double> submit = ex.submit(this::priceGenerator);
        return ex.submit(this::priceGenerator);

    }

    public CompletableFuture<Double> getPricesAsyncCompletableFuture(String storeName) {
        System.out.printf("Getting oruces sync for store %s%n", storeName);
        return CompletableFuture.supplyAsync(this::priceGenerator);

    }

    private double priceGenerator() {
        System.out.printf("%s generating price %n", Thread.currentThread().getName());
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }

    public static void shutshown() {
        ex.shutdown();
    }

    private void delay() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
