package com.example.supercoding.ch46;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInterfaceTest {
    public static void main(String[] args) {

        //List 정의
        List<String> frutList = new ArrayList<>();

        //add
        frutList.add("오렌지");
        frutList.add("키위");
        frutList.add("바나나");
        frutList.add("사과");

        System.out.println(frutList);

        //add (index, element)
        frutList.add(3,"애플망고");
        System.out.println(frutList);

        //remove
        frutList.remove(3);
        System.out.println(frutList);

        //가져오기
        String myFruit = frutList.get(3);
        System.out.println(myFruit);

        // set(index, element)
        frutList.set(0, "파인애플");
        System.out.println(frutList);

        //size
        System.out.println(frutList.size());


    }
}
