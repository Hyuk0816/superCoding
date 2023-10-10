package com.example.supercoding.ch36;

import java.sql.Driver;

public class IntefFaceTest2 {
    public static void main(String[] args) {

        //Drone
        Flyable drone = new Drone();
        Flyable airplane = new Airplane("AB1233");

        drone.fly();
        airplane.fly();

        if(drone instanceof Flyable){
            Drone drone2 = (Drone) drone;
            drone2.takePicture();
        }


    }
}
