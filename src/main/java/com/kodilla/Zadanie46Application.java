package com.kodilla;

public class Zadanie46Application {

    public static void main(String[] args) {

        Calculator calculator = new Calculator(10,5);
        System.out.println("Wynik dodawania to: " + calculator.add());
        System.out.println("Wynik odejmowania to: " + calculator.substract());
    }

}
