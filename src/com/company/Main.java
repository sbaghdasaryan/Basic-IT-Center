package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        float num;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the numbers");

//        I use "for operator" because need a check 3 cases together
        for (int i = 0; i < 3; i++) {
            num1 = scanner.nextInt();
            if (num1 % 2 == 0) {
                System.out.println("num1 is a even = " + num1);
            } else System.out.println("num1 is a odd = " + num1);
            
            num2 = scanner.nextInt();
            if (num2 % 2 == 0) {
                System.out.println("num2 is a even = " + num2);
            } else System.out.println("num2 is a odd = " + num2);

            if (num1 > num2) {
                System.out.println("num1 is a max = " + num1);
            } else if (num1 < num2) {
                System.out.println("num2 is a max = " + num2);
            } else System.out.println("num1 and num2 is equal");

            num3 = scanner.nextInt();
            num = 1.0f * (num1 + num2 + num3) / 3;
            System.out.println("The arithmetic average is a " + num);
        }
    }
}
