package com.company;

public class Methods_Detect {

    public static void main(String args[]) {
        int[] ints = {1,2,3,4,5,6,8,9};
        System.out.println(detMissNum(ints));
    }

    static int detMissNum(int[] arr) {
        int missNum = 0;

        for (int i=1; i<arr.length; i++) {
            if (arr[i] != arr[i-1] + 1) {
                missNum = arr[i] - 1;
                break;
            }
        }

        return missNum;
    }
}
