package com.example.supercoding.ch55;

public class LambdaTest2 {
    public static void main(String[] args) {
        MultipleNum multipleNum = num -> num * 2;

        int i1 = 100;
        StringNum stringNum2 = (str, num) -> {
            //i1 = 200; 읽는거 가능하지만 값 수정은 불가! 이너클래스와 같음
            for(int i=0; i<num; i++){
                System.out.println(str);
            }
        };
    }
}
