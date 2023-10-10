package com.example.supercoding.ch36;

public interface Flyable {
    //속성
    long atmosphereLimit = 476; //자동으로 static final

    default void fly(){
        System.out.println("<정보> 현재 이 사물은 날고 있습니다.");
    }

    static void printLanding(){
        System.out.println("<경보> 현재 이 사물은 공중에 있습니다");
    }



}
