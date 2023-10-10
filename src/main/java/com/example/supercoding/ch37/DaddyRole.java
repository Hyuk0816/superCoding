package com.example.supercoding.ch37;

public interface DaddyRole {

    void educateBaby(Baby baby);
    default void sayLoveEveryday(){
        System.out.println("우리 아기 사룽");
    };


}
