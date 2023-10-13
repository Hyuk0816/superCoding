package com.example.supercoding.subject_week4Day3.leadSubject;

public class Sophomore extends YoungGroupCollegeStudent{

    public Sophomore(String studentNumber, String name, double gpa) {
        super(studentNumber, name, gpa);
    }

    @Override
    public String toString() {
        return "Sophomore{" +
                "studentNumber='" + studentNumber + '\'' +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
