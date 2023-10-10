package com.example.supercoding.ch34;

public class GoldCustomer extends Customer{


    private double discountRatio;



    @Override
    public int calculatePrice(int price) {
        this.bonusPoint += (price * bonusPointRatio);
        price -= price*discountRatio;
        return price;
    }

    GoldCustomer(String name){
        super();
        this.customerID = "Customer" + Customer.serialNums++;
        this.name = name;
        this.customerGrade = "Gold";
        this.bonusPoint = 0;
        this.bonusPointRatio = 0.03;
        this.discountRatio = 0.03;
    }

    @Override
    void printMyInfo() {
        super.printMyInfo();
    }
}
