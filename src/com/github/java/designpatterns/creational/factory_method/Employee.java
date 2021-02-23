package com.github.java.designpatterns.creational.factory_method;

public abstract class Employee {

    public abstract double getSalary();

    public double calculateBonus(double rate){
        return getSalary()*rate;
    }
}
