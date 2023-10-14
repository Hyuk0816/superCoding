package com.example.supercoding.ch54;

public class OuterClass {

    private int outerData;

    public OuterClass(int outerData) {
        this.outerData = outerData;
    }

    public class InnerClass{

        private int InnerData;

        public InnerClass(int innerData) {
            InnerData = innerData;
        }

        void display(){
            System.out.println("OuterData :" + outerData); //private이여도 내부 class면 호출가능
            System.out.println("innerData :" + InnerData);
        }
    }

}
