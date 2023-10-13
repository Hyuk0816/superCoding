package com.example.supercoding.ch43;

public class ObjectTest {



    public static void main(String[] args) {

        Object customer = new GoldCustomer("민철");

        System.out.println(customer.toString());

        Staff staff = new Staff();
        VIPCustomer vipCustomer = new VIPCustomer("김재혁");

        System.out.println(staff);
        System.out.println(vipCustomer);

    }
}
