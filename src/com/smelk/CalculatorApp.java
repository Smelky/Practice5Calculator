package com.smelk;

import com.smelk.calculator.Calculator;

public class CalculatorApp {

    public static void main(String[] args) {
        System.out.println(Calculator.calculate(2, 2, '+'));
        System.out.println(Calculator.calculate(3.8, 3.5, '-'));
        System.out.println(Calculator.calculate(5.7, 2, '/'));
        System.out.println(Calculator.calculate(6, 2, '^'));
        System.out.println(Calculator.calculate(9, 2, '~'));
        System.out.println(Calculator.calculate(7, 2, '$'));
    }
}
