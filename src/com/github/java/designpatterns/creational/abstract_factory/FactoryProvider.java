package com.github.java.designpatterns.creational.abstract_factory;

public class FactoryProvider {
    public static AbstractFactory<?> getFactory(String choice){
        if("Animal".equalsIgnoreCase(choice)){
            return new AnimalFactory();
        }
        else if("Color".equalsIgnoreCase(choice)){
            return new ColorFactory();
        }

        return null;
    }
}
