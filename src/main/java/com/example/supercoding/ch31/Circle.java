package com.example.supercoding.ch31;

class Circle extends Shape {
    private static final double PI = 3.14;
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.color = color;
        this.radius = radius;
    }

    public double getArea() {
        double area = (radius * radius) * PI;
        System.out.printf("shape 면적의 크기 : ");
        return area;
    }

    public void printCircleInfo() {
        System.out.println("도형의 색상 :" + color);
        System.out.println("도형의 면적 :" + getArea());
        System.out.println("원의 반지름 :" + radius);
    }
}