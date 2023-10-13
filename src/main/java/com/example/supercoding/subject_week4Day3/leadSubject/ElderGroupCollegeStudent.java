package com.example.supercoding.subject_week4Day3.leadSubject;

abstract class ElderGroupCollegeStudent extends CollegeStudent{


    @Override
    public String toString() {
        return "ElderGroupCollegeStudent{" +
                "studentNumber='" + studentNumber + '\'' +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    public ElderGroupCollegeStudent(String studentNumber, String name, double gpa){
        super(studentNumber,name, gpa);
    }
}
