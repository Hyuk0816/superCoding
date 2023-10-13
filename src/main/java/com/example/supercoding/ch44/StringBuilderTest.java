package com.example.supercoding.ch44;

public class StringBuilderTest {

    public static void main(String[] args) {
        // +=

        String str = " ";

        long startTime = System.currentTimeMillis();


        for(int i = 0; i< 5000; i++){
            str += "cat";
        }


        long endTime = System.currentTimeMillis();
        System.out.println("걸린시간 그냥:" + (endTime - startTime) + "ms");

        StringBuilder sb = new StringBuilder();

        long startTime2 = System.currentTimeMillis();

        for(int i = 0; i<5000; i++){
            sb.append("cat");
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("걸린시간 스트링빌더:" + (endTime2 - startTime2) + "ms");

    }
}
