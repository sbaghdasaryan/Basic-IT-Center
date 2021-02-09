package com.company;

public class MatrixTask_1 {

    public static void main (String args[]) {
        int matrix[][] = new int[][] {
                {8,75,21,23},
                {17,82,61,5},
                {71,8,28,31},
                {12,47,32,3}
        };

        for (int i=0; i<4; i++) {
            System.out.println(matrix[i][matrix.length - 1 - i]);
        }
    }
}
