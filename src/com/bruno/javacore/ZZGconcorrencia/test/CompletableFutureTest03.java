package com.bruno.javacore.ZZGconcorrencia.test;

import com.bruno.javacore.ZZGconcorrencia.service.StoreService;
import com.bruno.javacore.ZZGconcorrencia.service.StoreServiceDeprecated;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFutureTest03 {
    public static void main(String[] args) {
        StoreServiceDeprecated storeServiceDeprecated = new StoreServiceDeprecated();
        searchPricesAsyncCompletableFuture(storeServiceDeprecated);
    }

    private static void searchPricesAsyncCompletableFuture(StoreServiceDeprecated storeService) {
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");

        List<CompletableFuture<Double>> completableFutures = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> storeService.getPriceSync(s)))
                .collect(Collectors.toList());

        completableFutures.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());



        long end = System.currentTimeMillis();
        System.out.printf("Time passes to searchPricesSync %dms%n", (end - start));

    }
}
