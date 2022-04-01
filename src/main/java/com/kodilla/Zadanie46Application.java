package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class Zadanie46Application {

    public static void main(String[] args) {
        SpringApplication.run(Zadanie46Application.class, args);

        Calculator calculator = new Calculator(10,5);
        System.out.println("Wynik dodawania to: " + calculator.add());
        System.out.println("Wynik odejmowania to: " + calculator.substract());
    }
}
