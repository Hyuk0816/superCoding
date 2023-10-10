package com.example.supercoding.ch37;

public interface FamilyRole extends DaddyRole,HusbandRole{

    @Override
    default void sayLoveEveryday() {
        DaddyRole.super.sayLoveEveryday();
        HusbandRole.super.sayLoveEveryday();
    }
}
