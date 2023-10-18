package com.example.supercoding.BankSimul;

public class Saving extends Account {

    private String backType;

    public Saving(String owner, String accountNum, long balance, String accountType, String backType) {
        super(owner, accountNum, balance, accountType,backType);
        this.backType = backType;
    }

    @Override
    public String toString() {
        return super.toString();

    }

}
