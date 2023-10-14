package com.example.supercoding.ch53;

public class StringNullThrowTest {

    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            throw new CustomException("CustomException이 발생했습니다."); //원래 main에서 던지면 안됨!  최종 처리단계여서!
        }
    }
}

class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }
}