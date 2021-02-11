package com.company;

import java.util.Scanner;

public class StringTask_2 {

    public static void main (String args[]) {
        char x;

        Scanner scanner = new Scanner(System.in);
        x = scanner.next().charAt(0);

        int i = Integer.parseInt(String.valueOf(x));
        System.out.println(i);
    }
}
