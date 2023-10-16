package com.example.supercoding.ch60.Singleton;

import com.example.supercoding.ch57.FileWriterStreamTest;

public class FileWriterSingletonTest {
    public static void main(String[] args) {
        Thread thread1 = new Thread( () -> {
            FileWriteSingleton writer = FileWriteSingleton.getInstance();
            writer.writeToFile("Thread 1: Message 1");
            writer.writeToFile("Thread 1: Message 2");
        });

        //jvm 가비지 콜렉터 회수X !

        Thread thread2 = new Thread(() -> {
            FileWriteSingleton writer = FileWriteSingleton.getInstance();
            writer.writeToFile("Thread 2: Message 3");
            writer.writeToFile("Thread 2: Message 4");
        });
        thread1.start();
        thread2.start();




    }
}
