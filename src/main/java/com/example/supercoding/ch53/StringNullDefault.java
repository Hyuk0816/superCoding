package com.example.supercoding.ch53;

public class StringNullDefault {

    public static void main(String[] args) {
        String str = null;
        try {
            int length = str.length();
            System.out.println(length);
        } catch (NullPointerException e) {
//            System.out.println("NullPointerException이 발생했습니다. 기본값을 사용합니다.");
            str = "";
            int length = str.length();
            System.out.println(length);
        }
    }
}