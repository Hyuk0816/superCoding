package com.example.supercoding.ch29;

public class Cashier {
    //속성
    private long salesAmount;

    //행위
    public long checkCoffeePrice(String coffeeName){

        long price;
        switch (coffeeName){
            case "아메리카노":
                price = 5000;
                break;

            case "카페라테":
                price = 6000;
                break;
            case "카페모카":
                price = 6500;
                break;
            case "카푸치노":
                price = 6000;
                break;
            default:
                price = 0;
                break;
        }
        return price;
    }
    public void replyCoffeePrice(String coffeeName, long price){
        if(price==0){
            System.out.println("죄송합니다, 메뉴가 없음요 :" + coffeeName + "없음..");
        }
        System.out.println("말씀하신 커피 " + coffeeName + "은 가격이 " + price + "원 입니다.");

    }
    public void addMount(long money){
        this.salesAmount += money;
    }
    public void sayOrder(String coffeeName){
        System.out.println("캐시어: 커피" + coffeeName + "주문이 들어 왔습니다.");
    }
    public Coffee wraupCoffee(Coffee coffee){
        coffee.beWrappedUp();
        return coffee;
    }
    public void sayCoffeeReady(Coffee coffee){
        String coffeeName = coffee.getCoffeeName();
        System.out.println("커피 준비 완료 : " + coffeeName);
    }

    public void setSalesAmount(long salesAmount) {
        this.salesAmount = salesAmount;
    }
}
