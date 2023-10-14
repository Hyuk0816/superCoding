package com.example.supercoding.ch53;

import com.example.supercoding.ch52.exception.IDFormatException;
import com.example.supercoding.ch52.exception.PositiveNumberException;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PTMember {

    private String ID;
    private String name;
    private Integer height;
    private Integer weight;
    private Gender gender;

    private LocalDateTime enrollTime;


    public PTMember(String name, Integer height, Integer weight, String gender) {
        if(height <= 0){throw new PositiveNumberException("키는 음수랑 0 불가능!");}
        if(weight <= 0){throw new PositiveNumberException("몸무게는 음수랑 0 불가능!");}

        this.name = name;
        this.height = height;
        this.weight = weight;
        this.gender = Gender.valueOfTerm(gender);
        this.enrollTime = LocalDateTime.now();
    }


    public void setID(String ID) {
        if(ID == null){throw new IDFormatException("ID는 Null이 될 수 없읍");}
        if(ID.length() < 8 || ID.length()>20 ){throw new IDFormatException("ID는 8자초과 20자 미만 으로 해주십쇼");}

        this.ID = ID;
    }

    @Override
    public String toString() {
        return "PTMember{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", gender=" + gender +
                ", enrollTime=" + enrollTime +
                '}';
    }
}
