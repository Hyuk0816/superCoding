package com.example.supercoding.ch59;

public class JavaThreading {
    public static void main(String[] args) {

        //Thread 실행
        Thread thread1 = new Thread(new Myrunnable());
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread :" + Thread.currentThread().getName() + "실헹 중 !");
            }
        });

        Thread thread3 = new Thread(() -> System.out.println("Thread :" + Thread.currentThread().getName() + "실헹 중 !"));
        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println("Thread :" + Thread.currentThread().getName() + "실헹 중 !");
    }

    //sttic runnable class
    static class Myrunnable implements Runnable{

        @Override
        public void run() {
            System.out.println("Thread :" + Thread.currentThread().getName() + " 실행 중 !");
        }
    }
}
