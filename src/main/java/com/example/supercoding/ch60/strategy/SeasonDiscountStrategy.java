package com.example.supercoding.ch60.strategy;

public class SeasonDiscountStrategy implements DiscountStrategy{
    @Override
    public double caculatorDiscount(double amount) {
        return amount * 0.1;
    }
}
