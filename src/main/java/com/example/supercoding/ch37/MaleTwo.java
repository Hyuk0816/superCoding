package com.example.supercoding.ch37;

public class MaleTwo extends FamilyMan implements FamilyRole,EmployeeRole{


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void workTogether(EmployeeRole employeeRole) {

        String name = employeeRole.getName();
        System.out.println(name + "인 직장동료와 업무를 하고 있습니다!");

    }

    public MaleTwo(String name) {

        this.name = name;
    }
}
