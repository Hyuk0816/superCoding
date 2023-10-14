package com.example.supercoding.ch57;

import java.io.IOException;

public class ConsoleTest {
    public static void main(String[] args) {
        // console system . in
        int i;

        System.out.println("입력값을 넣어 주세요 ");
        try {
            StringBuilder sb = new StringBuilder();
            while((i = System.in.read()) != '\n'){
                sb.append((char) i);
            }
            System.out.println("string 출력 :" +sb);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
