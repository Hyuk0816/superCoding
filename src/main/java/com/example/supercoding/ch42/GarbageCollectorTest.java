package com.example.supercoding.ch42;

public class GarbageCollectorTest {
    public static void main(String[] args) throws InterruptedException {

        Customer[] customers = new Customer[100];

        for(int i = 0; i<100; i++){
            Customer customer = new Customer("장민철");
            customers[i] = customer;
        }
        System.gc(); //이하 인스턴스를 쓰지 않으면 gc가 지워버림

        for(Customer customer : customers){
            customer.printMyInfo();
        }

        while (true){
            Thread.sleep(100);
        }

    }
}
