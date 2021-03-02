package com.company;

public class Task_Class {

    public static void main(String[] args) {
        Cup cup1 = new Cup("white cup", "white");
        Cup cup2 = new Cup("black cup", "black", 15);
        Cup cup3 = cup2;
        cup3.text = "blue cup";
        System.out.println(cup2.text);
    }

    public static class Cup {
        String text;
        String color;
        String type;
        int size;

        Cup (String s, String t) {
            text = s;
            type = t;
        }
        Cup (String s, String c, int i) {
            text = s;
            color = c;
            size = i;
        }
    }
}
