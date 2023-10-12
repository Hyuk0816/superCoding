package com.example.supercoding.subject_week4Day3.leadSubject;

public class Senior extends ElderGroupCollegeStudent{

    public Senior(String studentNumber, String name, double gpa) {
        super(studentNumber, name, gpa);
    }

    @Override
    public String toString() {
        return "Senior{" +
                "studentNumber='" + studentNumber + '\'' +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
