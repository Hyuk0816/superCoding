package com.example.supercoding.BankSimul;

import java.util.Random;

public class Customer extends Account{

    private String name;
    private long balance;

    public long getBalance() {
        return balance;
    }

    public Customer(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }


    @Override
    void makeAccount(Customer customer,Bank bank) {
        Account account = new Saving(customer.getName(),generateAccountNum(), balance, "Saving", bank.getBackName());
        System.out.println("계좌 개설 성공");
        System.out.println(account.toString());
    }

    @Override
    void deposit(int money) {
        if(money <= 0){
            System.out.println("0원 이하는 예치할 수 없습니다!");
        }else{
            balance += money;
            System.out.println(money + "원이 입금되었습니다. 현재 " + name+ "님의 잔액은 "  + balance + "원 입니다.");
        }
    }

    @Override
    void transferMoney(Customer customer, Bank bank,int money) {
        int commission = 500;
        if(balance<money){
            System.out.println("계좌에 잔액이 부족합니다.");
        }
        else {
            if(!bank.getBackName().equals(customer.getBackname())){
                customer.balance += money;
                balance -= (money + commission);
                System.out.println(money + "원이 송금 되었습니다. 현재 " + name+ "님의 잔액은 "+ balance+ "원 입니다." + "타은행 이체 수수료 " + commission + "원 " );
            }else{
                customer.balance += money;
                balance -= money;
                System.out.println(money + "원이 송금 되었습니다. 현재 " + name+ "님의 잔액은 "+ balance+ "원 입니다." );
            }
        }
    }



    private String generateAccountNum(){
        Random random = new Random();
        int randomNumber = random.nextInt(1000000);
        return "AccountNum" + String.format("%06d",randomNumber);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public String getName() {
        return name;
    }
}
