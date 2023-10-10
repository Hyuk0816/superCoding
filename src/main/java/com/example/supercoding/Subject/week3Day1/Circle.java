package com.example.supercoding.Subject.week3Day1;



public class Circle extends Shape{

    private double radius;

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return radius*radius * Math.PI;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public Circle(double radius){
        super(2, "기본색");
        this.radius = radius;

    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public double getDimension() {
        return super.getDimension();
    }

    public double calculateDiameter(){
        return 2*radius;
    }
}
