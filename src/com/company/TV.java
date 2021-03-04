package com.company;

public class TV {
    private String name;
    private String type;
    private double diagonal;

    TV(String s, double d) {
        name = s;
        setDiagonal(d);
        print();
    }

    TV(String s1, String s2) {
        name = s1;
        type = s2;
        print();
    }

    public void print() {
        if (name != null && type == null && diagonal != 0) {
            System.out.println(getName() + " -- " + getDiagonal() + "'");
        }

        if (name != null && type != null && diagonal == 0) {
            System.out.println(getName() + " -- " + getType());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String string) {
        name = string;
    }

    public String getType() {
        return type;
    }

    public void setType(String string) {
        type = string;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double d) {
        if (d>0) {
            diagonal = d;
        } else {
            System.out.println("Please enter valid diagonal value");
        }
    }
}
