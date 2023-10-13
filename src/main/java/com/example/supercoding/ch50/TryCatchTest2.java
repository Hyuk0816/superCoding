package com.example.supercoding.ch50;

import java.util.ArrayList;
import java.util.List;

public class TryCatchTest2 {
    public static void main(String[] args) {

        List<String > stringList = new ArrayList<>();

        stringList.add("hello");
        stringList.add("world");
        stringList.add("I");
        stringList.add("love");
        stringList.add(null);
        stringList.add("coding");

        for(int i=0; i<stringList.size()+5; i++){
            try {
                System.out.println("i :" + i);
                String str = stringList.get(i);
                System.out.println(str.toUpperCase());
            }catch (NullPointerException e){ //리스안에 null을 넣고 데이터 조작을 안하면 예외 처리 필요 없음
                System.out.println("들어갈 수 업음! ");
            }catch (IndexOutOfBoundsException e){
                System.out.println("인덱스 아웃바운드 익셉션");
                System.out.println(stringList.toString());
                break;
            }

        }

        System.out.println("메소드 종료");
    }
}
