package com.company;

public class Recursion_Sum {

    public static void main(String[] args) {
        System.out.println(sumDigits(123));
    }

    static int sumDigits(int num) {
        if (num%10 == num)
            return num;
        return num%10 + sumDigits(num/10);
    }
}
