package com.example.supercoding.Subject_week5Day1;

import java.util.Arrays;

import java.util.List;

public class ThreeThreadsListFiller {
    public static void main(String[] args) {
        // TODO: 작업할 List 생성
        int listSize = 1000;
        List<Integer> list = Arrays.asList(new Integer[listSize]);//interger array 를 list로 변환


        // 결과 확인
        System.out.println("List의 길이: " + list.size());
        System.out.println("List의 내용: " + list);

        // TODO: 3개의 쓰레드 생성, 업무 분담 실행
        Thread thread1 = new Thread(new ListFillerTask(list,0));
        Thread thread2 = new Thread(new ListFillerTask(list,1));
        Thread thread3 = new Thread(new ListFillerTask(list,2));

        // TODO: 3개 Thread 작업 진행
        thread1.start();
        thread2.start();
        thread3.start();

        // 결과 확인
        System.out.println("List의 길이: " + list.size());
        System.out.println("List의 내용: " + list);
    }

    // TODO: 자신이 맡은 리스트 인덱스의 값을 각각 0, 1, 2로 채우도록 구현하는 Task 구현 필요
    static class ListFillerTask implements Runnable {
        private List<Integer> list;
        private int num;

        public ListFillerTask(List<Integer> list, int num) {
            this.list = list;
            this.num = num;
        }

        @Override
        public void run() {

            // TODO
            for (int i = num; i <list.size(); i+=3) {
                list.set(i, num); //0,1,2 니까 3개 주기로 각 num이 채워 주기로 set(idx, value)
            }
        }
    }
}
