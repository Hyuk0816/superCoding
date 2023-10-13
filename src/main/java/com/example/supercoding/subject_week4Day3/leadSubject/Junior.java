package com.example.supercoding.subject_week4Day3.leadSubject;

public class Junior extends ElderGroupCollegeStudent{

    public Junior(String studentNumber, String name, double gpa) {
        super(studentNumber, name, gpa);
    }

    @Override
    public String toString() {
        return "Junior{" +
                "studentNumber='" + studentNumber + '\'' +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }


}
