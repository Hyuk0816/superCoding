package com.example.supercoding.ch43;

public class GoldCustomer extends Customer {


    private double discountRatio;

    static {
        System.out.println("gold 클래스가 로드!");
    }


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

    @Override
    public String toString() {
        return String.format("Customer(customerId = %s, name = %s, customerGrade = %s. bonusPoint = %s discountRatio=%f \n",
                this.customerID, this.name, this.customerGrade, this.bonusPoint, this.discountRatio);
    }


}
