package com.example.supercoding.ch53;

import java.util.Arrays;

public class DayEnumTest {
    public static void main(String[] args) {
        //각각 이넘값 정의 후
        //ordinal, compareTO, values

        Day monday = Day.MONDAY;
        Day sunday = Day.SUNDAY;
        Day thursday = Day.THURSDAY;

        System.out.println("ordinal : " + monday.ordinal());
        System.out.println("ordinal : " + sunday.ordinal()); //0 즉 주일부터 시작!
        System.out.println("ordinal : " + thursday.ordinal());

        System.out.println("comapeTo :" + monday.compareTo(sunday));
        System.out.println("comapeTo :" + monday.compareTo(thursday)); //어떤게 더 큰가, 빠른가 비교할 때 쓰임!

        Day[] days = Day.values();
        System.out.println(Arrays.toString(days));

    }
}
