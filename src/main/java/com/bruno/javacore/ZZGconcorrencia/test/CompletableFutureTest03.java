package com.bruno.javacore.ZZGconcorrencia.test;

import com.bruno.javacore.ZZGconcorrencia.service.StoreService;
import com.bruno.javacore.ZZGconcorrencia.service.StoreServiceDeprecated;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class CompletableFutureTest03 {
    public static void main(String[] args) {
        StoreServiceDeprecated storeServiceDeprecated = new StoreServiceDeprecated();
        searchPricesAsyncCompletableFuture(storeServiceDeprecated);
    }

    private static void searchPricesAsyncCompletableFuture(StoreServiceDeprecated storeService) {
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");
        ExecutorService executor = Executors.newFixedThreadPool(10, r -> {
            Thread thread = new Thread(r);
            thread.setDaemon(true);
            return thread;
        });
        List<CompletableFuture<Double>> completableFutures = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> storeService.getPriceSync(s), executor))
                .toList();

        List<Double> prices = completableFutures.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());

        System.out.println(prices);


        long end = System.currentTimeMillis();
        executor.shutdown();
        System.out.printf("Time passes to searchPricesSync %dms%n", (end - start));

    }

}
