package com.example.supercoding.Subject.week3Day1.LedearMission;

public class ReviewerUser extends User implements ReviewerRole, CustomerRole{
    public ReviewerUser(String username) {

        super(username);
    }

    @Override
    public void writeReview() {

        System.out.println("ReviewRole을 맡아서 리뷰 작성 가능");
    }

    @Override
    public void giveRating() {

        System.out.println("ReviewRole을 맡아서 점수 평가 가능");
    }

    @Override
    public void order() {
        System.out.printf("유저(%s)은 주문을 할 수 있습니다. \n" , username);
    }

    @Override
    public void payment() {
        System.out.printf("유저(%s)은 결제를 할 수 있습니다. \n" , username);
    }
}
