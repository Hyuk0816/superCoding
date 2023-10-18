package com.example.supercoding.BankSimul;

public abstract class Account {

    private String owner;
    private String accountNum;
    private long balance;
    private String accountType;

    private String backname;

    public String getBackname() {
        return backname;
    }

    public void setBackname(String backname) {
        this.backname = backname;
    }

    void deposit(int money){}
    void transferMoney(Customer customer,Bank bank,int money){}
    void makeAccount(Customer customer, Bank bank){}

    public Account(String owner, String accountNum, long balance, String accountType,String backname ) {
        this.owner = owner;
        this.accountNum = accountNum;
        this.balance = balance;
        this.accountType = accountType;
        this.backname = getBackname();
    }

    public Account(){}

    public long getbalance() {
        return balance;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public String getAccountType() {
        return accountType;
    }

    @Override
    public String toString() {
        return "Account{" +
                "owner='" + owner + '\'' +
                ", accountNum='" + accountNum + '\'' +
                ", balance=" + balance +
                ", accountType='" + accountType + '\'' +
                '}';
    }
}
