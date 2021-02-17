package com.company;

public class Methods_ArithmAverage {

    public static void main(String args[]) {
        int[] arr = {0,1,5,8,57};

        System.out.println(arithmAverage(arr));
    }

    static float arithmAverage(int[] arr) {
        float average;
        int sum = 0;

        for (int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        average = 1.0f*sum / arr.length;

        return average;
    }
}
