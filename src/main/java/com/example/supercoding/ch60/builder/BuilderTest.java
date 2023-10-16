package com.example.supercoding.ch60.builder;


public class BuilderTest {

    public static void main(String[] args){
        // 적용 전
        User user = new User("johh", "doe", 30, "jogn@gmail.com");
        System.out.println("적용 전" + user);
        //적용 후
        User user2 = new User.UserBuilder()
                .firstName("John")
                .lastName("Doe")
                .age(30)
                .email("rlawogur816@gmail.com")
                .build();

        System.out.println("적용 후" + user2);
    }
}
