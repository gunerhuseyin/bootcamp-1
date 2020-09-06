package org.kodluyoruz.trendyol.d.openclosed.bad1;

public class Calculator {

    public double calculate(CalculatorOperation operation) {
        double result = 0;

        if (operation instanceof Addition) {
            Addition addition = (Addition) operation;
            result = addition.getLeft() + addition.getRight();
        } else if (operation instanceof Subtraction) {
            Subtraction subtraction = (Subtraction) operation;
            result = subtraction.getLeft() - subtraction.getRight();
        }

        return result;
    }
}
