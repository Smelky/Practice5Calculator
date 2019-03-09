package com.smelk.calculator;

import java.util.Arrays;

public class Calculator {

    public static double calculate(double firstValue, double secondValue, char operation) {
        return calculateTwoValues(firstValue, secondValue, operation);

    }

    private static double calculateTwoValues(double firstValue, double secondValue, char function) {
        Operations result = Arrays.stream(Operations.values())
                .filter(operations -> operations.getOperator().equals(function))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
        return result.getResult(firstValue, secondValue);

    }
}
