package com.example.supercoding.ch57;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String[] args) {


        String content = "and i want sleep";

        try(FileOutputStream fos = new FileOutputStream("src/main/java/com/example/supercoding/ch57/outputTest.txt", true)) {

            byte[] bytes = content.getBytes();
            fos.write(bytes);

            System.out.println("txt 파일 생성 완료!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
