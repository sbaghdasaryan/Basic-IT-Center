package com.company;

public class Task_3 {

    public static void main (String args[]) {
        String s = "ape JAN test TEST";

        String[] strings = s.split(" ");
        for (String s1:strings) {
            for (int i=0; i<s1.length(); i++) {
                if (s1.charAt(i) > 96 && s1.charAt(i) < 123) {
                    for (int j=97; j<123; j++) {
                        if (s1.charAt(i) == j) {
                            System.out.print((char) (j-32));
                        }
                    }
                } else {
                    for (int j=65; j<91; j++) {
                        if (s1.charAt(i) == j) {
                            System.out.print((char) (j+32));
                        }
                    }
                }
            }
            System.out.print(" ");
        }
    }
}
