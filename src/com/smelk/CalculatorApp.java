package com.smelk;

import com.smelk.calculator.Calculator;

public class CalculatorApp {

    public static void main(String[] args) {
        Calculator.calculate(2, 2, '+');
        Calculator.calculate(3.8, 3.5, '-');
        Calculator.calculate(5.7, 2, '/');
        Calculator.calculate(6, 2, '^');
        Calculator.calculate(9, 2, '~');
        Calculator.calculate(7, 2, '$');
    }
}
