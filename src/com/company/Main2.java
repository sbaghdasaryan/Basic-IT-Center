package com.company;

public class Main2 {

    public static void main(String[] args) {
        TV tv1 = new TV("Sony", 51.5);
        TV tv2 = new TV("Panasonic", "Led");

        Circle circle1 = new Circle(2, 5, 4);
        Circle circle2 = new Circle(3);
        circle1.setX(777);
        circle2.setX(888);
        System.out.println(circle1.getX());
        System.out.println(circle2.getX());
    }
}
