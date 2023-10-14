package com.example.supercoding.Subject_Week4Day4.leadSubject;

public enum Gender {

    MALE("Male", "남자"),
    FEMALE("Female", "여자"),
    Unknown("unknown", "불명");

    private String englishTerm;
    private String koreanTerm;

    Gender(String englishTerm, String koreanTerm) {
        this.englishTerm = englishTerm;
        this.koreanTerm = koreanTerm;
    }

    public static Gender valueOfTerm(String str){
        for(Gender gender : values()){
            if(str.equals(gender.englishTerm) || str.equals(gender.koreanTerm)){
                return gender;
            }
        }
        return Gender.Unknown;
    }
}
