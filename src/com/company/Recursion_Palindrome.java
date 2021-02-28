package com.company;

public class Recursion_Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("asdfdsa"));
    }

    static boolean isPalindrome(String string) {
        if (string.length() <= 1) {
            System.out.println("is a Palindrome");
            return true;
        }
        if (string.charAt(0) != string.charAt(string.length()-1)) {
            System.out.println("is not a Palindrome");
            return false;
        }
        return isPalindrome(string.substring(1, string.length()-1));
    }
}
