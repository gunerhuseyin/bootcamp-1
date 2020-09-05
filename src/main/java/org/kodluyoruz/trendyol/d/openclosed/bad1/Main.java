package org.kodluyoruz.trendyol.d.openclosed.bad1;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Addition addition = new Addition(5, 8);
        calculator.calculate(addition);

        System.out.println(addition.getResult());

        Subtraction subtraction = new Subtraction(5, 8);
        calculator.calculate(subtraction);

        System.out.println(subtraction.getResult());
    }
}
