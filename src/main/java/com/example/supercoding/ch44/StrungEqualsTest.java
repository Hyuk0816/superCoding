package com.example.supercoding.ch44;

public class StrungEqualsTest {

    public static void main(String[] args) {

        String str1 = "CAT";
        String str2 = "CAT";


        String str3 = new String("CAT");
        String str4 = new String("Cat");

//        System.out.println(str3.equals(str4)); //내용비교이므로 값 똑같음
//        System.out.println(str3 == str4); //주소 값 비교 이므로 다른 주소에 있으므로 false

        //str1 , str3
        System.out.println(str3.equals(str1)); //true
        System.out.println(str3 == str1); //false
    }
}
