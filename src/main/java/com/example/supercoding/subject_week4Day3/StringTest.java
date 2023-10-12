package com.example.supercoding.subject_week4Day3;

public class StringTest {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

        // 2. String Builder로 개선하기
        String[] words = {"Java", "is", "a", "powerful", "programming", "language"};

        String concatenatedString = "";
        for (String word : words) {
            concatenatedString += word + " ";
        }
        System.out.println("일반 String 합치기 방식: " + concatenatedString);

        StringBuilder sb = new StringBuilder();
        for(String word : words){
            sb.append(word).append(" ");
        }
        System.out.println("스트링 빌더 사용 :" + sb.toString());






    }
}
