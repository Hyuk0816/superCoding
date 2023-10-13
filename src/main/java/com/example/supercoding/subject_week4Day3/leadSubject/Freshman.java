package com.example.supercoding.subject_week4Day3.leadSubject;

public class Freshman extends YoungGroupCollegeStudent{

    public Freshman(String studentNumber, String name, double gpa) {
        super(studentNumber, name, gpa);
    }

    @Override
    public String toString() {
        return "Freshman{" +
                "studentNumber='" + studentNumber + '\'' +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
