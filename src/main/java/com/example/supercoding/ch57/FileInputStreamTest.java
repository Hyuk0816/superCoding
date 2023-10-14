package com.example.supercoding.ch57;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) {
        //FileInputStream
        try(FileInputStream fis = new FileInputStream("src/main/java/com/example/supercoding/ch57/test_Korean")) {
            int i;
            while ((i=fis.read()) != -1){
                System.out.print((char) i);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } ;

    }
}
