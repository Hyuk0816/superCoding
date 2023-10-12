package com.example.supercoding.ch45;

public class PrintSituation {

    public static void main(String[] args) {
        // 1. 기획: String을 출력하는 프린터 만들어주세요~
        GeneralPrint<String> print = new GeneralPrint<>();
        print.setMaterial("설계도");

        String material = (String) print.getMaterial();
        print.printMyInfo();

        // 2. 기획: Integer을 출력하는 프린터 만들어주세요~
        GeneralPrint<Integer> print2 = new GeneralPrint<>();
        print2.setMaterial(1235);

        Integer intMaterial = (Integer) print2.getMaterial();
        print2.printMyInfo();

        // 3. 기획: Boolean을 출력하는 프린터 만들어주세요~
        GeneralPrint<Boolean> print3 = new GeneralPrint<>();
        print3.setMaterial(true);

        Boolean booleanMaterial = (Boolean) print3.getMaterial();
        print3.printMyInfo();

        //기획4: 아무것도 지정 안해주면 obj 타입으로 지정됨

        GeneralPrint print4 = new GeneralPrint();
        print4.setMaterial("설계도");

        String material4 = (String) print.getMaterial();
        print4.printMyInfo();
    }
}