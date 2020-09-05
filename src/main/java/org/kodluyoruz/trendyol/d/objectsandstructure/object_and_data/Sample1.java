package org.kodluyoruz.trendyol.d.objectsandstructure.object_and_data;

import org.kodluyoruz.trendyol.d.objectsandstructure.ex1.Point;

public class Sample1 {

    public interface Shape {
        double area();
    }

    public class Square implements Shape {

        private Point topLeft;
        private double side;

        public double area() {
            return side * side;
        }
    }

    public class Rectangle implements Shape {

        private Point topLeft;
        private double height;
        private double width;

        public double area() {
            return height * width;
        }
    }

    public class Circle implements Shape {

        public final double PI = 3.141592653589793;
        private Point center;
        private double radius;

        public double area() {
            return PI * radius * radius;
        }
    }

}
