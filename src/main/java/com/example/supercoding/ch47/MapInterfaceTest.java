package com.example.supercoding.ch47;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceTest {
    public static void main(String[] args) {
        //map 정의
        Map<String,Integer> fruitMap = new HashMap<>();

        //map에 데이터를 넣음

        fruitMap.put("사과", 7);
        fruitMap.put("키위", 27);
        System.out.println(fruitMap);

        Integer appleCount = fruitMap.get("사과");
        Integer bananaCount = fruitMap.get("키위");

        System.out.println(appleCount);
        System.out.println(bananaCount);



    }
}
