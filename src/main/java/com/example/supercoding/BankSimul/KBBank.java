package com.example.supercoding.BankSimul;

public class KBBank extends Account implements Bank{
    private String bankName  = "국민은행";

    @Override
    public void showCustomerInfo(Customer customer) {

        System.out.println("고객의 이름 :" + customer.getName() + " 잔액은 :" +
                customer.getbalance());

    }

    @Override
    public String setBankName() {
        return bankName;
    }

    @Override
    public String getBackName() {
        return bankName;
    }
}
