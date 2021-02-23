package com.github.java.designpatterns.creational.factory_method;

public class GetEmployeeFactory {

    public static Employee getEmployee(EnumType type){

        switch (type){
            case MANAGER:
                return new Manager();
            case SALESMAN:
                return new Salesman();
            case ACCOUNTANT:
                return new Accountant();
        }

        return null;
    }
}
