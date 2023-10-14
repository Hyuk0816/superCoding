package com.example.supercoding.ch55;

import java.util.Optional;
import java.util.function.Supplier;

public class OptinalLambdaTest {
    public static void main(String[] args) {
        String str= null;

        Optional<String > stringOptional = Optional.ofNullable(str);

        Supplier<String > stringSupplier = () -> "default"; //null이면 나옴
        String str2 = stringOptional.orElseGet(stringSupplier).toUpperCase();

        System.out.println(str2);
    }
}
