package com.company;

public class Circle {
    private double R, x, y;

    Circle(double r, double cord1, double cord2) {
        setR(r);
        x = cord1;
        y = cord2;
        System.out.println("Circle1 Perimeter = " + getPerimeter(r));
        System.out.println("Circle1 Area = " + getArea(r));
    }

    Circle(double r) {
        setR(r);
        x = 10;
        y = 20;
        System.out.println("Circle2 Perimeter = " + getPerimeter(r));
        System.out.println("Circle2 Area = " + getArea(r));
    }

    public double getPerimeter(double r) {
        setR(r);
        return 2*3.14*r;
    }

    public double getArea(double r) {
        setR(r);
        return 3.14*r*r;
    }

    public double getR() {
        return R;
    }

    private void setR(double r) {
        if (r>0) {
            R = r;
        } else {
            System.out.println("Please enter valid radius value");
        }
    }

    public double getX() {
        return x;
    }

    public void setX(double d) {
        x = d;
    }

    public double getY() {
        return y;
    }

    public void setY(double d) {
        y = d;
    }
}
