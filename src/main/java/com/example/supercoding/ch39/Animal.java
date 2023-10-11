package com.example.supercoding.ch39;

public abstract class Animal { //RUN이 안되면 컴파일 에러
    // 속성
    protected String gender;

    // 행위
    public abstract void eat(String food);


    public abstract void sleep();
}