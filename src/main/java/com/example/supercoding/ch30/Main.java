package com.example.supercoding.ch30;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("학생들이 없음 " + Arrays.toString(StudentScore.getAllScores()));

        StudentScore student1 = new StudentScore(85);
        System.out.println("학생 한명일 때 " + Arrays.toString(StudentScore.getAllScores()));

        StudentScore student2 = new StudentScore(90);
        StudentScore student3 = new StudentScore(77);

        System.out.println("여러 명 추가후 전체 시험 점수: " + Arrays.toString(StudentScore.getAllScores()));
        student1.setScore(95);
        student2.setScore(88);
        student3.setScore(55);

        System.out.println("변경된 전체 시험 점수: " + Arrays.toString(StudentScore.getAllScores()));


    }

}
