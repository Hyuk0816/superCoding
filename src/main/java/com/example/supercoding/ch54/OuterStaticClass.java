package com.example.supercoding.ch54;

public class OuterStaticClass {
    private int outerData;

    public OuterStaticClass(int outerData) {
        this.outerData = outerData;
    }

    public static class InnerClas{
        private int innerData;

        public InnerClas(int innerData) {
            this.innerData = innerData;
        }

        void dispaly(){
            System.out.println("outerData :" ); //static이기 때문에 아우터 호출 불가 같은 static이면 호출 가능!
        }
    }
}
