package org.example;


import org.example.models.Calculator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main method");
        Calculator one = new Calculator();
        one.calculate(3,4);
    }

}