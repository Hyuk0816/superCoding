package com.example.supercoding.ch36;

public class Drone implements Flyable{

    private String DroneID;
    private long fuelAmount;
    private long remainingStorage;


    public void takePicture(){
        Flyable.printLanding();
        System.out.println("이 드론은 사진을 찍고 있습니다.");
    }


}
