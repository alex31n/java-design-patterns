package com.github.java.designpatterns.creational.singleton;

public class EarlySingletonObject {

    private static final EarlySingletonObject instance = new EarlySingletonObject();

    private EarlySingletonObject(){}

    public static EarlySingletonObject getInstance() {
        return instance;
    }

    public void doSomething(){
        System.out.println("EarlySingletonObject doSomething...");
    }
}
