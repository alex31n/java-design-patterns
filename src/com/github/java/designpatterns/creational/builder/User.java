package com.github.java.designpatterns.creational.builder;

public class User {

    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String email;
    private String phone;
    private String address;

    private User(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName= builder.lastName;
        this.age = builder.age;
        this.gender = builder.gender;
        this.email = builder.email;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class Builder{
        private String firstName;
        private String lastName;
        private int age;
        private String gender;
        private String email;
        private String phone;
        private String address;

        public Builder(){

        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

}
