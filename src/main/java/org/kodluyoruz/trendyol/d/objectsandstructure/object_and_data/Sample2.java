package org.kodluyoruz.trendyol.d.objectsandstructure.object_and_data;

import org.kodluyoruz.trendyol.d.objectsandstructure.ex1.Point;

public class Sample2 {

    public class Square {//Data structure

        public Point topLeft;
        public double side;
    }

    public class Rectangle {//Data structure

        public Point topLeft;
        public double height;
        public double width;
    }

    public class Circle {//Data structure

        public Point center;
        public double radius;
    }

    public class Geometry {

        public final double PI = 3.141592653589793;

        public double area(Object shape) throws Exception {
            if (shape instanceof Square) {
                Square s = (Square) shape;
                return s.side * s.side;
            } else if (shape instanceof Rectangle) {
                Rectangle r = (Rectangle) shape;
                return r.height * r.width;
            } else if (shape instanceof Circle) {
                Circle c = (Circle) shape;
                return PI * c.radius * c.radius;
            }
            throw new Exception();
        }
    }

}
