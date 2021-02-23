package com.github.java.designpatterns.creational.singleton;

public class LazySingletonObject {

    private static LazySingletonObject mInstance = null;

    private LazySingletonObject(){

    }

    public static LazySingletonObject getInstance() {
        if (mInstance ==null){
            mInstance = new LazySingletonObject();
        }

        return mInstance;
    }

    public void doSomething(){
        System.out.println("LazySingletonObject doSomething...");
    }
}
