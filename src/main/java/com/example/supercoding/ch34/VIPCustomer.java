package com.example.supercoding.ch34;

import java.sql.Struct;

public class VIPCustomer extends Customer{

    //속성

    static int serialNums = 1;

    private String agentID;
    private double discountRatio;

    //행위;
    @Override
    public int calculatePrice(int price){
        this.bonusPoint += (price * bonusPointRatio);
        price -= price * discountRatio ;
        return price;
    }

    public void callAgent(){
        System.out.println("담당 직원 " + this.agentID + "님 문의가 있습니다!");

    }

    VIPCustomer(String name){
        super();
        this.customerID = "VIP" + serialNums++;
        this.name = name;
        this.customerGrade = "VIP";
        this.bonusPoint = 0;
        this.bonusPointRatio = 0.05;
        this.discountRatio = 0.1;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }

    @Override
    void printMyInfo(){
        System.out.print("VIP");
        super.printMyInfo();
    }


}
