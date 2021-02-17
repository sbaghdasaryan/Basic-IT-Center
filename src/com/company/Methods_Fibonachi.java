package com.company;

import java.util.Scanner;

public class Methods_Fibonachi {

    public static void main(String args[]) {
        int i;

        Scanner scanner = new Scanner(System.in);
        i = scanner.nextInt();

        if (i>1) fibonachi(i);
    }

    static void fibonachi(int count) {
        int[] ints = new int[count];
        ints[0] = 0;
        ints[1] = 1;

        System.out.print("0,1");

        for (int i=2; i<count; i++) {
            ints[i] = ints[i-1] + ints[i-2];
            System.out.print("," + ints[i]);
        }
    }
}
