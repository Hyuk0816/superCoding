package com.example.supercoding.ch52;

public class ThrowUncheckException {

    public static void main(String[] args) {
        System.out.println("멧드 시작!");

        int myInt = 0;
        try {
            myInt = getDivide(0);
        } catch (Exception e) {
            System.out.println("익셉션 처리!");
            e.printStackTrace();
        }

        System.out.println("I :" + myInt);
        System.out.println("멧드 종료");
    }

    static int getIntElement(int idx) throws Exception {
        int[] arrInt = {1,2,3,4,5,6,7,8,9,10};

        if(idx > arrInt.length){
            throw new Exception("인덱스는 어레이 범위를 넘을 수 없음");

        }
        return arrInt[idx];
    }

    static int getDivide(int num) throws Exception {
        if(num==0) {
            throw new Exception("num은 0이될 수 없음!");
        }
        int data = 100/num;

        return data;
    }
}
