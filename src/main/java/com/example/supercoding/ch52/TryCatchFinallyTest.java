package com.example.supercoding.ch52;

public class TryCatchFinallyTest{
    public static void main(String[] args) {

        System.out.println("메인 메소드 실행");

        try{
            Integer myInt = 0;
            Integer data = 100 / myInt;

            System.out.println("data :" + data);
        }catch (ArithmeticException e){
            System.out.println("myint는 0불가!");
            e.printStackTrace();
        }finally {
            System.out.println("여기는 무조건 실행되는 finally");
            //조건문이 충족 되도 finally는 실행 됨!! 쩐당
        }

        System.out.println("메인메소드 종료");
    }
}
