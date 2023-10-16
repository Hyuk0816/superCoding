package com.example.supercoding.ch59;

public class MultiThreadingExample {
    public static void main(String[] args) {
        //1 ~ 100까지 출력! 멀티 쓰레딩으로 분담!

        //2명 Thread
        Thread thread1 = new Thread(new PrintNumberRunnable(1, 50));
        Thread thread2 = new Thread(new PrintNumberRunnable(51, 100));

        thread1.start();
        thread2.start();

    }

}
