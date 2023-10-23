package com.example.supercoding.ch92;

public class Main {
    public static void main(String[] args) {

        ClassA classA = new ClassA();
//        classA.sayHello(); //NPE 발생!

        ClassB classB = new ClassB();

        ClassA classA1 = new ClassA(classB);

        classA1.sayHello();


        classA.setClassB(classB); //세터로 classb 넣어줌
        classA.sayHello();
    }
}
