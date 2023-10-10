package com.example.supercoding.Subject.week3Day1;

public class Rectangle extends Shape{

    private double width;
    private double height;

    public Rectangle(double width, double height){
        super(2, "기본색");
        this.width = width;
        this.height = height;

    }


    public double calculateDiagonal(){
        return Math.sqrt(width * width + height * height);
    }

    @Override
    public double getDimension() {
        return super.getDimension();
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width+height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
