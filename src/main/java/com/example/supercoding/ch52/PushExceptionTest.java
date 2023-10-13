package com.example.supercoding.ch52;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PushExceptionTest {

    public static void main(String[] args) {

        try{
            printFile("src/main/java/com/example/supercoding/ch51/test.txt");
            System.out.println("예외처리 성공!");
        }catch (FileNotFoundException e){

            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }


    }

    static void printFile(String filename) throws IOException {
        FileInputStream fs = getFileStream(filename);

        int i;

        while((i = fs.read())!= -1){
            System.out.write(i);
        }


    }

    static FileInputStream getFileStream(String filename) throws FileNotFoundException {
        FileInputStream fs = new FileInputStream(filename);
        return fs;
    }
}
