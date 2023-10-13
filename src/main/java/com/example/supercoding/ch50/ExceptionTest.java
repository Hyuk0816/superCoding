package com.example.supercoding.ch50;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("메인 메소드가 시작");
        makeUncheckException();

        makeCheckException();

    }

    public static void makeUncheckException(){
        int[] intArr = {1,2,3,4,5,6,7,8,9,10};
        int idx = 1;

        System.out.println("값 :" + intArr[idx]);
    }
    public static void makeCheckException() throws FileNotFoundException {
        File file = new File("src/main/java/com/example/supercoding/ch50/test.txt");
        FileInputStream fs = new FileInputStream(file);
        System.out.println("Fs 실행!");
    }
}
