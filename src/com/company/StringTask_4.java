package com.company;

public class StringTask_4 {

    public static void main (String args[]) {
        String string = "Hello World";
        String[] strings = string.split(" ");

        for (String s: strings) {
            for (int i=0; i<s.length(); i++) {
                System.out.print(s.charAt(s.length()-i-1));
            }
            System.out.print(" ");
        }
    }
}
