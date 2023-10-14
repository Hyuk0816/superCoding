package com.example.supercoding.ch53;

public class DayTest {
    public static void main(String[] args) {

        Day monday = Day.MONDAY;
        Day friday = Day.FIRDAY;

//        System.out.println("요일 :" + monday);
//        System.out.println("요일 :" + monday.getKoreanName());
//        System.out.println("요일 :" + friday);
//        System.out.println("요일 :" + friday.getKoreanName());

        Day day = Day.SATURDAY;

        switch(day){
            case MONDAY:
                System.out.println("한 주의 시작! :" + day.getKoreanName());

            case TUESDAY:
                System.out.println("오늘은 화요일! :" + day.getKoreanName());
                break;
            case WEDNESDAY:
                System.out.println("오눌은 수요일!" + day.getKoreanName());
                break;
            case THURSDAY:
                System.out.println("오늘은 목요일:" + day.getKoreanName());
                break;
            case FIRDAY:
                System.out.println("오늘은 불금! :" + day.getKoreanName());
                break;
            case SATURDAY:
                System.out.println("오늘은 토욜 :"+ day.getKoreanName());
                break;
            case SUNDAY:
                System.out.println("오늘은 주일!" + day.getKoreanName());
                break;
         }

    }
}
