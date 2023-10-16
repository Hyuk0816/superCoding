package com.example.supercoding.ch58;

import java.sql.SQLOutput;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceTest1 {
    public static void main(String[] args) {

        //static method
        Consumer<String> ex1 = Printer::printSomething;
        //람다로
        Consumer<String > ex2 = (str) -> Printer.printSomething(str);

        ex1.accept("메소드 레퍼런스 사용");
        ex2.accept("lambda 식으로 사용");

        //비어있는 생성자 호출
        Supplier<Customer> ex3 = () -> new Customer();
        Supplier<Customer> ex4 = Customer::new;

        System.out.println(ex3.get());
        System.out.println(ex4.get());

        Function<String, Customer> ex5 = (str) -> new Customer(str);
        Function<String, Customer> ex6 = Customer::new;

        System.out.println("name 들어간 생성자 람다" + ex5.apply("김재혁"));
        System.out.println("name 들어간 생성자 래퍼런스" + ex6.apply("김태민"));




    }
}
