package org.kodluyoruz.trendyol.d.openclosed.good1;

public class Addition implements CalculatorOperation {
    private double left;
    private double right;

    public Addition(double left, double right) {
        this.left = left;
        this.right = right;
    }

    public double getLeft() {
        return left;
    }

    public void setLeft(double left) {
        this.left = left;
    }

    public double getRight() {
        return right;
    }

    public void setRight(double right) {
        this.right = right;
    }

    @Override
    public double perform() {
        return left + right;
    }
}
