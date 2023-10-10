package com.example.supercoding.ch29;

//1. 주문 알림
//2. 물 500 원두 30 으로 커피 만듬
// 3. 완성 알림

public class Barista {

    //속성

    //행위
    public void noticeOrder(String coffeName){
        System.out.println("바리스타 : " + coffeName);
    }
    public Coffee makeUpCoffee(String coffeName, long waterQuantity, long coffeebeanQuantity){
        Coffee coffee = new Coffee(coffeName, waterQuantity, coffeebeanQuantity);
        return coffee;
    }
    public void sayCoffeeReady(Coffee coffee){
        String coffeeName = coffee.getCoffeeName();
        System.out.println("바리스타: 커피 제작 완료: " + coffeeName);
    }
}
