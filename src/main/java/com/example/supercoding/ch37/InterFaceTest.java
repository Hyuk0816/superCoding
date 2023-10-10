package com.example.supercoding.ch37;

public class InterFaceTest {
    public static void main(String[] args) {

        //Male의 역할 3개 ->  아빠, 남편, 회사원

        HusbandRole male = new Male("재혁");
        Wife wife = new Female("오현지");
        male.sayLoveEveryday();
        male.takeCareWife(wife);


        //이어서 아부지
        DaddyRole maleDaddy = (DaddyRole) male;
        Baby baby = new Baby("정우성");
        maleDaddy.educateBaby(baby);
        maleDaddy.sayLoveEveryday();

        //회사원
        EmployeeRole maleEmployee = (EmployeeRole) maleDaddy;
        EmployeeRole maleEmployeeTwo = new MaleTwo("김태민");
        maleEmployee.workTogether(maleEmployeeTwo);


    }
}
