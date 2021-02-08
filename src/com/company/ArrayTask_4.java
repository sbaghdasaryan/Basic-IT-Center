package com.company;

public class ArrayTask_4 {

    public static void main(String[] args) {
        int count = 0;

        int[] primeNums = {11, 25, 0, 0, 7, -8, 4, 4, 20, 7, 25, -8, 0, 25, 10, 7};

        for (int i=0; i< primeNums.length; i++) {
            for (int j=i+1; j< primeNums.length; j++) {
                if (primeNums[i] == primeNums[j] ) {
                    count++;
                    System.out.println(primeNums[i] + "   " + count);
                }
            }
        }

        System.out.println("-----------------");
        int[] repArr = new int[count];
        int k = 0;
        for (int i=0; i< primeNums.length; i++) {
            for (int j=i+1; j< primeNums.length; j++) {
                if (primeNums[i] == primeNums[j] ) {
                    repArr[k] = primeNums[i];
                    System.out.println(repArr[k]);
                    k++;
                }
            }
        }
        System.out.println("-----------------");

        System.out.println(repArr[0]);
        for (int i=1; i< repArr.length; i++) {
            boolean notEqual = false;
            for (int j=i-1; j>=0; j--) {
                if (repArr[i] != repArr[j]) {
                    notEqual = true;
                } else {
                    notEqual = false;
                    break;
                }
            }
            if (notEqual) {
                System.out.println(repArr[i]);
            }
        }
    }
}
