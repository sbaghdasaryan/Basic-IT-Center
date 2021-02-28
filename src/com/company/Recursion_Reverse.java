package com.company;

public class Recursion_Reverse {

    public static void main(String[] args) {
        System.out.println(reverseString("abcd"));
    }

    static String reverseString(String string) {
        if (string.length() == 0)
            return "";
        return string.charAt(string.length()-1)
                + reverseString(string.substring(0, string.length()-1));
    }
}
