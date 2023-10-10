package com.example.supercoding.Subject.week3Day1;

public abstract class  Shape{
    protected int dimension;
    protected String color;

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public Shape(){}
    public Shape(int dimension, String color){
        this.dimension = dimension;
        this.color = color;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDimension() {
        return dimension;
    }
}
