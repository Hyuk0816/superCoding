package com.example.supercoding.ch55;

public class LambdaUseTest {
    public static void main(String[] args) {
        MultipleNum multipleNum = (num) -> num * 10;
        MultipleNum multipleNum2 = (num) -> num * 20;
//        prinNum(multipleNum);
//        prinNum(multipleNum2);
//        prinNum((x)-> x*100); //실무에서 많이 쓰임

        GenericLambda<String > genericLambda1 = (str) -> str.toUpperCase();
        GenericLambda<Integer> genericLambda2 = (num) -> num * 2;
        GenericLambda<Boolean> genericLambda3 = (myBool) -> myBool & true;

        System.out.println(genericLambda1.calculator("abc"));
        System.out.println(genericLambda2.calculator(10));
        System.out.println(genericLambda3.calculator(true));



    }
    static void prinNum(MultipleNum multipleNum){
        int result = multipleNum.claculate(5);
        System.out.println(result);
    }
}
