package com.example.supercoding.ch58;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("C001", "이순신"));
        customers.add(new Customer("C002", "아이유"));
        customers.add(new Customer("C003", "카리나"));
        customers.add(new Customer("C004", "윈터"));

        // Q) StringUtils의 isLongName static 메소드를 이용하여 긴 이름의 손님들 이름을 출력
        customers.stream().map((customer) -> customer.name)
                .filter((name) -> StringUtils.isLongName(name))
                .forEach(name -> System.out.println(name));

        customers.stream().map((customer) -> customer.name)
                .filter(StringUtils::isLongName)
                .forEach(System.out::println);


        List<String> customerNames = Arrays.asList(
                "이순신",
                "민지",
                "오해원",
                "아이유"
        );

        // Q) 손님들 이름을 가지고, 새로운 Customer List를 만들어라.
        List<Customer> customerList = customerNames.stream()
                .map(Customer::new) //
                .collect(Collectors.toList());  //customerNames 이 온다는 것을 미리 자바가 알고 str 하나만 들어가는 생성자로 생성

        System.out.println("customerList: " + customerList);
    }
}