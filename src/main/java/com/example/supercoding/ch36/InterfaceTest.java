package com.example.supercoding.ch36;

public class InterfaceTest {
    public static void main(String[] args) {

        //속성
        System.out.println(Flyable.atmosphereLimit);

        //Flyable
        Flyable bird = new Bird();
        Flyable airplane = new Airplane("AB1122");

        bird.fly();
        airplane.fly();

        Walkable person = new Person();
        Person person2 = new Person();
        person2.setName("김재혁");
        Walkable robot = new Robot("RB1223");

        person.walk();
        robot.walk();

        if(robot instanceof Robot){
            Robot robot2 = (Robot) robot;
            robot2.helpPerson(person2);
        }


    }
}
