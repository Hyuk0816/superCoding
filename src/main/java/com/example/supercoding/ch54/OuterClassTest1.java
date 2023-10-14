package com.example.supercoding.ch54;

public class OuterClassTest1 {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass(20);

        OuterClass.InnerClass innerClass = outerClass.new InnerClass(21);

        innerClass.display();

        //정적 중첩 클래스
        OuterStaticClass outerStaticClass = new OuterStaticClass(30);

        OuterStaticClass.InnerClas innerclass2 = new OuterStaticClass.InnerClas(40);

        innerclass2.dispaly();
    }
}
