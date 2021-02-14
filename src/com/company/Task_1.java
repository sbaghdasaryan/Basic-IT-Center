package com.company;

public class Task_1 {

    public static void main (String args[]) {
        String string = "123456";

        for (int i=string.length()-1; i>=0; i--) {
            if (i == 0) {
                System.out.print(string.charAt(i));
            } else System.out.print(string.charAt(i) + ",");
        }
    }
}
