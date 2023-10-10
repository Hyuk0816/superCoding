package com.example.supercoding.ch37;

public abstract class FamilyMan implements FamilyRole, EmployeeRole{

    protected String name;
    protected int age;
    protected String job;

    @Override
    public void educateBaby(Baby baby) {
        String name = baby.getName();
        System.out.println(name + "아기를 열심히 교육중");
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void workTogether(EmployeeRole employeeRole) {

        String name = employeeRole.getName();
        System.out.println(name + "인 직장동료와 업무를 하고 있습니다!");

    }

    @Override
    public void takeCareWife(Wife wife) {
        String name = wife.getName();
        System.out.println(name + "인 아내를 성심 성의껏 케어합니다.");
    }

}
