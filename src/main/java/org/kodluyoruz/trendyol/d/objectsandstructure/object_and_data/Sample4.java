package org.kodluyoruz.trendyol.d.objectsandstructure.object_and_data;

public class Sample4 {

    public interface Shape {

        double area();
    }

    public class Square implements Shape {

        private double side;

        public double area() {
            return side * side;
        }
    }

    public class Circle implements Shape {

        private double PI;
        private double radius;

        @Override
        public double area() {
            return PI * radius * radius;
        }
    }

    public class Triangle implements Shape {

        public double height;
        public double side;

        @Override
        public double area() {
            return (side * height) / 2;
        }
    }


    public class Rectangle implements Shape {

        private double height;
        private double width;

        @Override
        public double area() {
            return height * width;
        }
    }

}
