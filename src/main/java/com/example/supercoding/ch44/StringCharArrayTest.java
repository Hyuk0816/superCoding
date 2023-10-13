package com.example.supercoding.ch44;

public class StringCharArrayTest {

    public static void main(String[] args) {
        //Chararray와 String의 관게
        char[] chars = {'a', 'b', 'c'};

        String str1 = new String(chars);
        String str2 = String.valueOf(chars);

        System.out.println(str1);
        System.out.println(str2);

        System.out.println(str1.charAt(0));
        System.out.println(str1.charAt(1));
        System.out.println(str1.charAt(2));

    }
}
