package org.kodluyoruz.trendyol.d.objectsandstructure.object_and_data;

public class Sample3 {

    private class Rectangle {

        public double height;
        public double width;
    }

    public class Square {

        public double side;
    }

    public class Circle {

        public double radius;
    }

    public class Triangle {

        public double height;
        public double side;
    }

    public class Geometry {

        private double PI = 3.14;

        public double area(Object object) throws Exception {

            if (object instanceof Rectangle) {
                final Rectangle re = (Rectangle) object;

                return re.height * re.width;
            } else if (object instanceof Square) {
                final Square sq = (Square) object;

                return sq.side * sq.side;
            } else if (object instanceof Circle) {
                final Circle circle = (Circle) object;

                return PI * circle.radius * circle.radius;

            } else if (object instanceof Triangle) {
                final Triangle tri = (Triangle) object;

                return (tri.side * tri.height) / 2;
            } else {
                throw new Exception();
            }
        }

        //hayal ettik


    }

}
