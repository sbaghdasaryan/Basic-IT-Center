package com.company;

import java.util.Scanner;

public class ArrayTask {

    public static void main(String[] args) {
        int x;
        int i = 25;

        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();

//        If need a input only positive int
        int[] arrayNums = new int[x+1];

        for (int j = 0; j < x+1; j++) {
            arrayNums[j] = i;
            i=i+19;
        }

        System.out.println(arrayNums[x]);

//        If need a input only 0 or 1
//        int[] arrayNums = {25, 44};
//        System.out.println(arrayNums[x]);
    }
}
