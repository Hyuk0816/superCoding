package com.example.supercoding.ch60.strategy;

public class ReferanceFriendDiscountStrategy implements DiscountStrategy{
    @Override
    public double caculatorDiscount(double amount) {
        return amount*0.15;
    }
}
