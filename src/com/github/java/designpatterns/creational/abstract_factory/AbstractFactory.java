package com.github.java.designpatterns.creational.abstract_factory;

public interface AbstractFactory<T> {
    T create(String animalType);
}
