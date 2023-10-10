package com.example.supercoding.ch30;

import java.util.Arrays;

public class StudentScore {

    // static
    private static int serialIndex; //객체 생성이 될 때 하나씩 늘어나서 myindex에 대입
    private static int[] allScores;

    private int myIndex; //allscore 배열의 각자 인덱스
    private int score;

    public static int[] getAllScores() {
        return allScores;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
        allScores[myIndex] = score;
    }

    public StudentScore(int score) {
      this.myIndex = serialIndex++;
      this.score = score;
      addAllScore(score);

    }
    public static void initializeAllScore(int score){
        allScores = new int[]{score};

    }

    private static void addAllScore(int score) {
        if(allScores == null){
            initializeAllScore(score);
            return;
        }
        int length = allScores.length;
        allScores = Arrays.copyOf(allScores, length+1);
        allScores[length] = score;
    }
}
