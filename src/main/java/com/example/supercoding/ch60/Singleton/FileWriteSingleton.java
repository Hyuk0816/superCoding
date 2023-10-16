package com.example.supercoding.ch60.Singleton;


import java.io.FileWriter;
import java.io.IOException;

public class FileWriteSingleton {
    private static FileWriteSingleton instance;

    private FileWriter fileWriter;


    public FileWriteSingleton() {
        try{
            this.fileWriter = new FileWriter("src/main/java/com/example/supercoding/ch60/Singleton/test.txt");

        }catch (IOException e){
            e.printStackTrace();
        }

    }
    public synchronized static FileWriteSingleton getInstance(){
        if(instance == null){
            instance = new FileWriteSingleton();
        }
        return instance;
    }

    public synchronized void writeToFile(String message){
        try {
            fileWriter.write(message + "\n");
            fileWriter.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public synchronized void closeFIle(){
        try {
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
