package com.example.supercoding.BankSimul;

public class TossBank  extends Account  implements Bank{

    private String bankName = "Toss";

    @Override
    public String setBankName() {
        return bankName;
    }

    @Override
    public String getBackName() {
        return bankName;
    }

    @Override
    public void showCustomerInfo(Customer customer) {
        System.out.println("고객의 이름 :" + customer.getName() + " 잔액은 :" +
                customer.getbalance());
    }

    @Override
    public void setBackname(String backname) {
        super.setBackname(backname);
    }
}
