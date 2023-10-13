package com.example.supercoding.ch47;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInterfaceTest {
    public static void main(String[] args) {

        //set 인터페이스 구현 //set은 중복을 허용하지 않음
        Set<String > fruitSet = new HashSet<String>();

        fruitSet.add("오렌지");
        fruitSet.add("사과");
        fruitSet.add("수박");
        fruitSet.add("오렌지"); //증복 허용 X


        System.out.println(fruitSet);



    }
}
