package com.github.java.designpatterns.creational.singleton;

public class Main {

    public static void main(String[] args) {

        EarlySingletonObject earlySingletonObject = EarlySingletonObject.getInstance();
        earlySingletonObject.doSomething();

        LazySingletonObject lazySingletonObject = LazySingletonObject.getInstance();
        lazySingletonObject.doSomething();
    }
}
