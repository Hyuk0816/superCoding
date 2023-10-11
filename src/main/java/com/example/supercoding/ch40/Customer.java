package com.example.supercoding.ch40;

public class Customer {
    //속성

    static int serialNums = 1;

    protected String customerID;
    protected String name;
    protected String customerGrade;
    protected double bonusPoint;
    protected double bonusPointRatio;

    //행위
    public int calculatePrice(int price){
        this.bonusPoint += price * bonusPointRatio;
        return price;
    }
    Customer(){}
    Customer(String name){
        this.customerID = "Customer" + serialNums++;
        this.name = name;
        this.customerGrade = "SILVER";
        this.bonusPointRatio = 0.01;
        this.bonusPoint = 0;
    }

    void printMyInfo(){
        System.out.printf("Customer(customerId = %s, name = %s, customerGrade = %s. bonusPoint = %s\n" ,
                this.customerID, this.name, this.customerGrade, this.bonusPoint);
    }







}
