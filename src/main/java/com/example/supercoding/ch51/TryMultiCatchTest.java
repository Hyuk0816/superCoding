package com.example.supercoding.ch51;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryMultiCatchTest {
    public static void main(String[] args) {

        try{
            FileInputStream fs = new FileInputStream("src/main/java/com/example/supercoding/ch51/test.txt");

            int i = 10;
            int data = 100/i;

            String str = "abc";
            System.out.println(str.toUpperCase());

            int idx = 10;
            int[] intArr = new int[10];
            System.out.println(intArr[idx]);

        }catch (FileNotFoundException  e){
            System.out.println("파일 못찾았엉!");
            e.printStackTrace();
        }catch (ArithmeticException | NullPointerException e){
            System.out.println("0으로는 못나눔! or null은 데이터 조작 못함");
            e.printStackTrace();
        }catch (Exception e){ //이 exception을 맨앞에 두면 문제는 일단 해결되지만 예상되는거를 앞에 두고 마지막 필터로 사용!
            System.out.println("예상 못한 예외 발생!");
        }

        System.out.println("메인 종료");

    }
}
