package com.github.java.designpatterns.creational.abstract_factory;

public class Duck implements Animal{
    @Override
    public String getAnimal() {
        return "Duck";
    }

    @Override
    public String makeSound() {
        return "Squeks";
    }
}
