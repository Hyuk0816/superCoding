package com.example.supercoding.ch54;

public class LocalTest {
    public static void main(String[] args) {

        class LocalWalk implements Walkable{
            @Override
            public void walk() {
                System.out.println("LocalWalk : Walking");
            }
        }
        LocalWalk localWalk = new LocalWalk();
        localWalk.walk(); //main 밖에서는 안됨!

        int i =100;

        //익명클래스
        Walkable anonymousWalk = new Walkable() {
            @Override
            public void walk() {
                //i =200; 하지만 데이터 변경은 불가능함!
                System.out.println("익명 이너클래스 외부 클래스의 변수를 쓸 수 있을까? " + i);
                System.out.println("익명이너클래스 걷는거 성공");
            }
        };

        anonymousWalk.walk();

    }

}