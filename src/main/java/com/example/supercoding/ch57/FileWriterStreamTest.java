package com.example.supercoding.ch57;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileWriterStreamTest {
    public static void main(String[] args) {


        String content = "소금빵, 스테이크 먹고싶어요";

        try(FileWriter fos = new FileWriter("src/main/java/com/example/supercoding/ch57/outputTest.txt", true)) {


            fos.write(content);

            System.out.println("txt 파일 생성 완료!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
