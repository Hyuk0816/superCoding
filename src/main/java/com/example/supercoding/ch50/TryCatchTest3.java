package com.example.supercoding.ch50;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchTest3 {
    public static void main(String[] args) {

        try{
            FileInputStream fs = new FileInputStream("com/example/supercoding/ch50/test.txt");
            int i;
            while((i=fs.read()) != -1){
                System.out.write(i);
            }

        }catch (FileNotFoundException e){
            System.out.println("File을 찾을 수 없습니다!");

        } catch (IOException e) {
            System.out.println("입출력 과정에서 문제 발생!");
            throw new RuntimeException(e);
        }
    }
}
