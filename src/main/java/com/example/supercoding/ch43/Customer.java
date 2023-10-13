package com.example.supercoding.ch43;

public class Customer {
    //속성

    static int serialNums = 1;

    static {
        System.out.println("Customer 클래스가 로딩!");
    }

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

    public Customer(String customerID, String name) {
        this(name);
        this.customerID = customerID;
    }

    void printMyInfo(){
        System.out.printf("Customer(customerId = %s, name = %s, customerGrade = %s. bonusPoint = %s\n" ,
                this.customerID, this.name, this.customerGrade, this.bonusPoint);
    }

    @Override
    public String toString() {
        return String.format("Customer(customerId = %s, name = %s, customerGrade = %s. bonusPoint = %s\n" ,
                this.customerID, this.name, this.customerGrade, this.bonusPoint);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if (obj instanceof Customer){
            Customer customer = (Customer) obj;
            if (customer.customerID == this.customerID){
                return true;
            }
        }
        return false;
    }
}
