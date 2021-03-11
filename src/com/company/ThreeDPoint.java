package com.company;

public class ThreeDPoint extends TwoDPoint{
    private int z1, z2;
    private double distance;

    public ThreeDPoint(int x1, int x2, int y1, int y2, int z1, int z2) {
        super(x1, x2, y1, y2);
        this.z1 = z1;
        this.z2 = z2;
        distanceTwoPoint(x1, x2, y1, y2, z1, z2);
    }

    public double distanceTwoPoint(int x1, int x2, int y1, int y2, int z1, int z2) {
        distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1) + (z2-z1)*(z2-z1));

        if (distance == 0) {
            System.out.println("The dots are on top of each other");
        }
        return distance;
    }

    public double getDistance() {
        return distance;
    }

    public int getZ1() {
        return z1;
    }

    public void setZ1(int z1) {
        this.z1 = z1;
    }

    public int getZ2() {
        return z2;
    }

    public void setZ2(int z2) {
        this.z2 = z2;
    }
}
