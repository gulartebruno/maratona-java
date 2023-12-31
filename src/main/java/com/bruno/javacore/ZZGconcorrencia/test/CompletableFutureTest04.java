package com.bruno.javacore.ZZGconcorrencia.test;

import com.bruno.javacore.ZZGconcorrencia.dominio.Quote;
import com.bruno.javacore.ZZGconcorrencia.service.StoreServiceWithDiscount;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureTest04 {
    public static void main(String[] args) {
        StoreServiceWithDiscount service = new StoreServiceWithDiscount();
        searchPricesWithDiscountAsync(service);
    }

    private static void searchPricesWithDiscountAsync(StoreServiceWithDiscount service) {
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");

        List<CompletableFuture<String>> completableFutures = stores.stream()
                // Getting the price async storeName::price::discountCode
                .map(s -> CompletableFuture.supplyAsync(() -> service.getPriceSync(s)))
                // Instatiating a new quote from the string generated by getPriceSync
                .map(cf -> cf.thenApply(Quote::newQuote))
                // Composing the first completable future
                .map(cf -> cf.thenCompose(quote -> CompletableFuture.supplyAsync(() -> service.applyDiscount(quote))))
                .toList();

        completableFutures.stream()
                .map(CompletableFuture::join)
                .forEach(System.out::println);


        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesAsync %dms%n", (end - start));
    }
}
