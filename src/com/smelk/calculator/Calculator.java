package com.smelk.calculator;

import java.util.Arrays;

public class Calculator {

    public static double calculate(double firstValue, double secondValue, char operation) {
        Operations result = Arrays.stream(Operations.values())
                .filter(operations -> operations.getOperator().equals(operation))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
        return result.getResult(firstValue, secondValue);
    }
}
