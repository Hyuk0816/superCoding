package com.example.supercoding.ch54;

public class StingUtilTest {
    public static void main(String[] args) {

        String str = "Hello, World";
        char target = 'o';

        //1.문자열이 비어있는지 확인
        boolean isEmpty = StringUtils.isEmpty(str);


        //2. 문자열을 반대로 뒤집기
        String str2 = StringUtils.reverse(str);
        //3. 주어진 문자열에서 특정 문자 개수 세기
        int countChar = StringUtils.CharChecker.countChar(str, target);



        //4. 주어진 문자열에 특정 문자가 있는지 확인
        boolean containCahr = StringUtils.containsChar(str, target);

    }




}
