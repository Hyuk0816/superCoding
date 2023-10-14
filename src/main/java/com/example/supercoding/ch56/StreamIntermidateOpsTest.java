package com.example.supercoding.ch56;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntermidateOpsTest {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Watermelon");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Strawberry");

        //filter 이름으 길이가 6인 이상의 과일만 선택
        fruits.stream().filter((fruit) -> fruit.length() >= 6)
                .forEach((fruit) -> System.out.println("길이가 6 이상만! : " + fruit));

        //distinct 중복된 과일 제거
        List<String> fruitList = fruits.stream().distinct().collect(Collectors.toList());

        System.out.println("중복 적용 전 :" + fruits);
        System.out.println("중복 처리 후 :" + fruitList);

        //과일 이름을 대문자로 변화 map
        List<String > fruitListMap = fruits.stream().map((fruit) -> fruit.toUpperCase())
                .collect(Collectors.toList());
        List<Integer > fruitListMap2 = fruits.stream().map((fruit) -> fruit.length())
                .collect(Collectors.toList());
        System.out.println("대문자 적용 후 :" + fruitListMap);
        System.out.println("이름의 길이로 변환 :" + fruitListMap2);

        //limit
        List<String> fruitList3 = fruits.stream().limit(3).collect(Collectors.toList());
        System.out.println("리밑 적용 후: " + fruitList3);

        List<String> fruitList4 = fruits.stream().skip(4).collect(Collectors.toList());
        System.out.println("스킵 적용 후: " + fruitList4);

        //sorted:
        List<String> fruitList5 = fruits.stream().sorted().collect(Collectors.toList());
        System.out.println("정렬 후: " + fruitList5);

        //sorted string 길이 짧은 순으로 정렬
        List<String> fruitList6 = fruits.stream().sorted((fruit1, fruit2) -> fruit1.length()- fruit2.length())
                .collect(Collectors.toList());
        System.out.println("길이 짧은 순으로 정렬: " + fruitList6);
    }
}
