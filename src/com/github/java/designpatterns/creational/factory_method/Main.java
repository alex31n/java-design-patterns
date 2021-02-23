package com.github.java.designpatterns.creational.factory_method;

public class Main {

    // calculate the tax for each employees
    public static void main(String[] args) {

        double bonusRate = 0.05;  // 5 percent

        Employee manager = GetEmployeeFactory.getEmployee(EnumType.MANAGER);
        System.out.printf("Bonus amounts of com.github.alex31n.Manager is: %.2f", manager.calculateBonus(bonusRate));
        System.out.println();

        Employee accountant = GetEmployeeFactory.getEmployee(EnumType.ACCOUNTANT);
        System.out.printf("Bonus amounts of com.github.alex31n.Accountant is: %.2f", accountant.calculateBonus(bonusRate));
        System.out.println();
        
        Employee salesman = GetEmployeeFactory.getEmployee(EnumType.SALESMAN);
        System.out.printf("Bonus amounts of com.github.alex31n.Salesman is: %.2f", salesman.calculateBonus(bonusRate));




    }
}
