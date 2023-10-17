package com.example.supercoding.ch60.strategy;

public class DiscountCalculator {
    private DiscountStrategy discountStrategy;

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateDiscount(double amount) {
        if (discountStrategy != null) {
            return discountStrategy.caculatorDiscount(amount);
        }
        else {
            return 0; // 할인 없음
        }
    }
}
