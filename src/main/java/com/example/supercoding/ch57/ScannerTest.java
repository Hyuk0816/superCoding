package com.example.supercoding.ch57;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        //Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("이름을 입력해 주세요");
        String name = scanner.nextLine();

        System.out.println("직업을 입력해주세요 ");
        String job = scanner.nextLine();

        System.out.println("나이를 입력해주세요");
        int age = scanner.nextInt();

    }
}
