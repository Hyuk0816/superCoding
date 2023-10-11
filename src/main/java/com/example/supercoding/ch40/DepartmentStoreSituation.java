package com.example.supercoding.ch40;

public class DepartmentStoreSituation {
    public static void main(String[] args) {

        //전제 상황
        int price = 10_000;
        Staff staff = new Staff();
        staff.setSalesAmount(1_000_000);

        Customer customer =  new VIPCustomer("오현지");

        Customer customer1 = new GoldCustomer("김선민");



        Customer[] customerQueue = {
            new Customer("임준배"), new Customer("여태수"), new VIPCustomer("김재혁"),
            new VIPCustomer("김태민"), new Customer("김현우"), new VIPCustomer("정혜은")
           , new Customer("김혜민"), new VIPCustomer("강지현"), customer, customer, customer1, customer1
        };

        //시나리오
        for(Customer customerEach: customerQueue){
            customerEach.printMyInfo();
            int cash = staff.helpPayment(customerEach, price);
            System.out.printf("내가 내는 금액은?! : %d \n", cash);
            staff.addSalesAmount(cash);
        }

        staff.printMySalesAmount();


    }
}
