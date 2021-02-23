package com.github.java.designpatterns.creational.abstract_factory;

public class Main {

    public static void main(String[] args) {
        AbstractFactory abstractFactory;

        //creating a brown toy dog
        abstractFactory = FactoryProvider.getFactory("Animal");
        Animal animal =(Animal) abstractFactory.create("Dog");

        abstractFactory = FactoryProvider.getFactory("Color");
        Color color =(Color) abstractFactory.create("Brown");

        String result = "A " + animal.getAnimal() + " with " + color.getColor() + " color " + animal.makeSound();

        System.out.println(result);
    }
}
