package com.example.supercoding.ch56;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTerminalOpsTest {
    public static void main(String[] args) {
        // List ( 미리 복사해오기 )
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Watermelon");
        fruits.add("Pineapple");
        fruits.add("Strawberry");

        //list (integer)
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);

        //1.for each
        fruits.stream().forEach((fruit) -> System.out.println("for each로 출력 :" + fruit));

        //2. collect 다른 또는 같은 컬렉션 반환
        //set 중복 제거 타입
        Set<String> fruitSet = fruits.stream().collect(Collectors.toSet());
        System.out.println("fruitset 출력 :" + fruitSet );

        //3.findFirst() : stream의 첫번 쨰 값 산출, optimal
        Optional<String> fruitsOptional = fruits.stream().findFirst();
        System.out.println("optional fruit: " + fruitsOptional.orElseGet(() -> "기본")); //순서 유지!

        //sum , average
        System.out.println("sum 값은?: " + integers.stream().mapToInt((i) -> i).sum());
        System.out.println("average 값은?: " + integers.stream().mapToInt((i) -> i).average());

        //count, max, min
        System.out.println("Stream 의 길이: " + integers.stream().count());
        System.out.println("가장 큰 값? : " + integers.stream().mapToInt((i) -> i).max());
        System.out.println("가장 작은 값? : " + integers.stream().mapToInt((i) -> i).min());


        //reduce로 소모 값구하기
        int result = integers.stream().reduce(0,(int1, int2) -> int1 + int2); //그냥 요소 싹 다 더하는것!
        System.out.println("result 값: " + result); //왜 쓰이는 걸까,,? 




    }
}
