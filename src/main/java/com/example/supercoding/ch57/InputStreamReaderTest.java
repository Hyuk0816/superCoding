package com.example.supercoding.ch57;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
    public static void main(String[] args) {

        int i;
        StringBuilder sb1 = new StringBuilder();
        System.out.println("입력값을 넣어 주세요 ");
        try {

            while((i = System.in.read()) != '\n'){
                sb1.append((char) i);
            }
            System.out.println("input stream 적용 전 :" +sb1.toString());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int j;
        StringBuilder sb2 = new StringBuilder();

        System.out.println("입력값을 넣어 주세요 ");
        try(InputStreamReader isr = new InputStreamReader(System.in)) {
            while((j = isr.read()) != '\n'){
                sb2.append((char) j);
            }
            System.out.println("inputStream 적용 휴 :" +sb2.toString());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
