package com.example.supercoding.ch45;

public class PointSituation {
    public static void main(String[] args) {

        Point<Integer, Integer> point1 = new Point<>(1,5);
        Point<Integer, Double> point2 = new Point<>(5,4.55);
        Point<Double, Double> point3 = new Point<>(1.5,5.5);


        System.out.println(point1.caculateDistance());
        System.out.println(point2.caculateDistance());
        System.out.println(point3.caculateDistance());






    }
}
