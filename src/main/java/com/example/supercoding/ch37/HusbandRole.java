package com.example.supercoding.ch37;

public interface HusbandRole {

    void takeCareWife(Wife wife);
    default void sayLoveEveryday(){
        System.out.println("우리 아내 사랑!");
    };

    String getName();

}
