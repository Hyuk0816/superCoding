package com.example.supercoding.ch31;

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.color = color;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        double area = width * height;
        System.out.printf("직사각형 넓이 :");
        return area;
    }

    public void printRectangleInfo() {
        System.out.println("도형의 색상은 :" + color);
        System.out.println("도형의 넓이는 :" + getArea());
        System.out.println("도형의 가로 :" + width);
        System.out.println("도형의 세로 :" + height);

    }
}