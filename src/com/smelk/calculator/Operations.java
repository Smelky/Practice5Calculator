package com.smelk.calculator;

import java.util.function.DoubleBinaryOperator;

public enum Operations {

    ADDITION("+", (firstValue, secondValue) -> firstValue + secondValue),
    SUBTRACTION("-", (firstValue, secondValue) -> firstValue - secondValue),
    MULTIPLICATION("*", (firstValue, secondValue) -> firstValue * secondValue),
    DIVIDE("/", (firstValue, secondValue) -> firstValue / secondValue),
    ROOT("~", (firstValue, secondValue) -> Math.pow(firstValue, 1 / secondValue)),
    EXPONENTIATION("^", Math::pow),
    SPECIAL("$", (firstValue, secondValue) -> Math.pow((firstValue + secondValue) / firstValue + 117, secondValue));

    private final String operator;
    private final DoubleBinaryOperator result;

    Operations(String operator, DoubleBinaryOperator result) {
        this.operator = operator;
        this.result = result;
    }

    public String getOperator() {
        return operator;
    }

    public double getResult(double firstValue, double secondValue) {
        return result.applyAsDouble(firstValue, secondValue);
    }
}
