package com.example.supercoding.ch56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest1 {
    public static void main(String[] args) {

        //stream of , Arrays.Stream, Collection(=list) -> Stream

        Stream<String> fruits = Stream.of("apple", "banana", "orange");
        Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6,7,8,9,10);

        //Arrays.toStream
        Stream<String > fruits2 = Arrays.stream(new String[]{"Apple", "Banana", "Orange"});
        Stream<Integer> integerStream2 = Arrays.stream(new Integer[]{1,2,3,4,5,6,7,8,9,10});

        //Collections
        List<String > fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Orange");
        fruitList.add("Mango");
        fruitList.add("Grapes");

        Stream<String> fruits3 = fruitList.stream();

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        integerList.add(8);
        integerList.add(9);
        integerList.add(10);

        Stream<Integer> integerStream3 = integerList.stream();

        //Stream 가지거 for loop
//        for(String fruit : fruitList){
//            System.out.println("fol loop 로 산출 :" + fruit.toUpperCase());
//        }

        //Stream -> 원본 데이터에 복사해서 1회용으로 사용한 느낌
        fruits3.forEach((fruit)-> System.out.println("for each으로 산출 : " + fruit.toUpperCase()));

        integerStream3.filter((i) -> i% 2==0)
                .filter((i) -> i>4)
                .forEach((integer) -> System.out.println("짝수 산출 :" + integer));

        //stream 을 한번 사용하면 재사용 불가능 stream has already been operated upon or closed
        //integerStream3.forEach((i) -> System.out.println(i)); sql 뷰같은 거
    }
}
