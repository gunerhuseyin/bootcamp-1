package org.kodluyoruz.trendyol.d.openclosed.good1;


public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Addition addition = new Addition(5, 8);
        double sum = calculator.calculate(addition);
        System.out.println(sum);

        Subtraction subtraction = new Subtraction(5, 8);
        double subtract = calculator.calculate(subtraction);
        System.out.println(subtract);


        Division division = new Division(5, 8);
        double divide = calculator.calculate(division);
        System.out.println(divide);
    }
}
