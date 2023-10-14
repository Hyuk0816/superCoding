package com.example.supercoding.ch55;

public class LambdaTest1 {
    public static void main(String[] args) {
        MultipleNum multipleNum1 = (x) -> x*2;
        MultipleNum multipleNum2 = (i) -> i *2;
        MultipleNum multipleNum3 = (x) -> x*3;

        System.out.println(multipleNum1.claculate(5));
        System.out.println(multipleNum2.claculate(3));

        System.out.println(multipleNum3.claculate(3));

        StringNum stringNum1 = (x,y) -> System.out.println("stringNum1 :" + x);
        StringNum stringNum2 = (x,y) -> {
            for(int i=0; i<y; i++){
                System.out.println("stringNum2 :" + x);
            }
        };
        StringNum stringNum3 = (x,y) ->{
            StringBuilder sb= new StringBuilder();
            for(int i=0; i<y; i++){
                sb.append(x);
            }
            System.out.println("stringNum3 :" +sb.toString());
        };
        stringNum1.printString("Hello", 5);
        stringNum2.printString("Hello", 5);
        stringNum3.printString("Hello", 5);

    }



}
