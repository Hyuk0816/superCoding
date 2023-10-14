package com.example.supercoding.Subject_Week4Day4.leadSubject;

enum OrderStatus {

    PAID("주문 완료"),
    SHIPPED("출고 완료"),
    DELIVERD("배송 완료"),

    NOT_PAID("결제 대기"),
    ON_ODRED("주문 처리 중");

    private final String status;

    OrderStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
