package com.example.supercoding.ch29;

public class Customer {

    //속성
    private long cashAmount;
    private String myFeeling;

    //행위
    public void askCoffee(Cashier cashier, String coffeeName){
        System.out.println("손님 커피" + coffeeName + "얼마 인가요?");
    }

    public long withDraw(long amount){
        this.cashAmount -= amount;
        return amount;
    }
    public void orderCoffee(String coffeeName, boolean isWrappedUp){
        System.out.println("손님 커피 " + coffeeName + "주문 할게요,!!" +
                "단 포장 여부는" + isWrappedUp + "부탁 드랴욥");
    }
    public void drinkCoffee(Coffee coffee){
        String coffeeName = coffee.getCoffeeName();
        System.out.println("나는 커피 "+ coffeeName + "을 마신다");
    }
    public void upgradeMyFeeling(){
        this.myFeeling = "기분이 좋아짐";
    }

    public void setCashAmount(long cashAmount) {
        this.cashAmount = cashAmount;
    }

    public void showMyInfo(){
        System.out.println("지금 나의 기분은 %s 하고, 현금은 %d 만큼 있습니다 "+ this.myFeeling +  this.cashAmount);

    }
}
