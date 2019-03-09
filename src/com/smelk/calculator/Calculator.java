package com.smelk.calculator;

import java.util.Arrays;

public class Calculator {

    public static void calculate(double firstValue, double secondValue, char operation) {
        String function = String.valueOf(operation);
        System.out.println(calculateTwoValues(firstValue, secondValue, function));

    }

    private static double calculateTwoValues(double firstValue, double secondValue, String function) {
        Operations result = Arrays.stream(Operations.values())
                .filter(operations -> operations.getOperator().equals(function))
                .findFirst()
                .orElseThrow();
        return result.getResult(firstValue, secondValue);

    }
}
