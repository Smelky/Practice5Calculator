package com.smelk.calculator;

import java.util.function.BinaryOperator;


public enum Operations {

    ADDITION('+', (firstValue, secondValue) -> firstValue + secondValue),
    SUBTRACTION('-', (firstValue, secondValue) -> firstValue - secondValue),
    MULTIPLICATION('*', (firstValue, secondValue) -> firstValue * secondValue),
    DIVIDE('/', (firstValue, secondValue) -> firstValue / secondValue),
    ROOT('~', (firstValue, secondValue) -> Math.pow(firstValue, 1 / secondValue)),
    EXPONENTIATION('^', Math::pow),
    SPECIAL('$', (firstValue, secondValue) -> Math.pow((firstValue + secondValue) / firstValue + 117, secondValue));

    private final Character operator;
    private final BinaryOperator<Double> result;

    Operations(Character operator, BinaryOperator<Double> result) {
        this.operator = operator;
        this.result = result;
    }

    public Character getOperator() {
        return operator;
    }

    public double getResult(double firstValue, double secondValue) {
        return result.apply(firstValue, secondValue);
    }
}
