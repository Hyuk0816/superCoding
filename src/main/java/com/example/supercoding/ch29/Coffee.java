package com.example.supercoding.ch29;


//아메리카노 커피는 물 500ml 원두 30g으로 만들어짐
// 아메리카노 커피는 테이크 아웃용으로 포장
public class Coffee {

    private String coffeeName;
    private long waterQuantity; //ml 단위
    private long coffeeBeanQuantity; //g 단위
    private boolean isWrappedUp; ///포장 여부

    //행위
    void beWrappedUp() {
        this.isWrappedUp = true; //포장 여부 true로 바꿈
    }

    //생성자
    Coffee(String coffeeName, long waterQuantity, long coffeeBeanQuantity) {
        this.coffeeName = coffeeName;
        this.waterQuantity = waterQuantity;
        this.coffeeBeanQuantity = coffeeBeanQuantity;
        isWrappedUp = false;
    }


    public String getCoffeeName() {

        return coffeeName;
    }
    public boolean isWrappedUp(){
        return isWrappedUp;
    }
}



