package com.github.java.designpatterns.creational.builder;

public class Main {

    public static void main(String[] args) {

        User user = new User.Builder()
                .firstName("Chris")
                .lastName("Edwards")
                .age(30)
                .gender("Male")
                .email("email@example.com")
                .phone("111-222-333333")
                .address("Street, City, State, Zip Code")
                .build();

        System.out.println(user.toString());
    }
}
