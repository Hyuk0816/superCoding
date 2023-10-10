package com.example.supercoding.ch36;

public class Robot implements Walkable{

    //속성

    private String robotId;
    private String modelname;
    private String color;

    public Robot(String robotId) {
        this.robotId = robotId;
    }

    @Override
    public void walk() {
        System.out.println("로봇 ID " + robotId + "가 걷고 있습니다!");
    }

    public void helpPerson(Person person){
        String name = person.getName();
        System.out.println("로봇이 인간 " + name + "을 돕습니다.");
    }
}
