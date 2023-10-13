package com.example.supercoding.ch50;

public class TryCatchTest1 {
    public static void main(String[] args) {

        System.out.println("메인 메소드 실행합니다.");

        try{
            int  i = 0;
            int data = 50/i;
            System.out.println(data);
        }catch (ArithmeticException e){
            System.out.println("0으로는 나눌 수 가 없음!");
            System.out.println("data : " + 0);
        }



        //중간 에러때문에 로직 진행 안됨!

        System.out.println("메인 메소드 종료합니다.");


    }
}
