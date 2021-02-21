package com.company;

public class Methods_Overloading {

    public static void main(String args[]) {
        System.out.println(substring("abcde", 2));
        System.out.println(substring("abcde", 1, 3));
        System.out.println(sumDoubles(1.5, 2.5, 3.5, 4.3, 8.1, 12));
    }

    static String substring(String string, int start) {
        String s = "";
        if (start < string.length()) {
            for (int i=start; i<string.length(); i++) {
                s+=string.charAt(i);
            }
        } else {
            System.out.println("Please insert second parameter small then " + string.length());
        }
        return s;
    }

    static String substring(String string, int start, int end) {
        String s = "";
        if (end < string.length()) {
            for (int i=start; i<=end; i++) {
                s+=string.charAt(i);
            }
        } else {
            System.out.println("Please insert third parameter small then " + string.length());
        }
        return s;
    }

    static int sumDoubles(double...args) {
        double sum = 0;
        for (double s:args) {
            sum+=s;
        }
        return (int) sum;
    }
}
