package com.example.supercoding.BankSimul;

public class main {
    public static void main(String[] args) {

        Customer customer1 = new Customer("김재혁", 0);
        Customer customer2 = new Customer("김태민", 0);
        Bank toss = new TossBank();
        Bank kb = new KBBank();
        customer1.makeAccount(customer1, toss);
        customer2.makeAccount(customer2, kb);

        customer1.deposit(10000);

        customer1.transferMoney(customer2, kb,8000);

        System.out.println(customer1.toString());
        System.out.println(customer2.toString());
    }

}
