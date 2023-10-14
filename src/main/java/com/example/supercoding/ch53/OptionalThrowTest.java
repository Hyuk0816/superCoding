package com.example.supercoding.ch53;

import java.util.Optional;

public class OptionalThrowTest {
    public static void main(String[] args) {

        String str = null;
        Optional<String > stringOptional = Optional.ofNullable(str);

        int length = stringOptional.orElseThrow(()->{throw new CustomException("customException 발생!");})
                .length(); //main에서는 안됨!


        System.out.println(length);

    }
}
