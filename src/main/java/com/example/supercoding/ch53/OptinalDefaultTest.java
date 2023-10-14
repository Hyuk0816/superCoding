package com.example.supercoding.ch53;

import java.util.Optional;

public class OptinalDefaultTest {
    public static void main(String[] args) {
        String  str = null;
        Optional<String > optionalS = Optional.ofNullable(str);

        int length = optionalS.orElseGet(() -> "")
                .length();

        System.out.println(length);
    }
}
