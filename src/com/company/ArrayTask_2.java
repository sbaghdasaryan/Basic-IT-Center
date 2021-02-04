package com.company;

public class ArrayTask_2 {

    public static void main(String[] args) {
        int sumPos = 0;
        int sumNeg = 0;
        int sumZero = 0;
        int sumSameFirst = 0;
        int sumPal = 0;

        int[] primeNums = {3,-5,13,3,0,7,0,3,13,-5,3};

        for (int i=0; i<primeNums.length; i++) {
            if (primeNums[i] > 0) {
                sumPos +=1;
            } else if (primeNums[i] < 0) {
                sumNeg +=1;
            } else sumZero+=1;

            if (primeNums[i] == primeNums[primeNums.length-i-1]) {
                sumPal +=1;
            }
        }

        if (sumPal == primeNums.length) {
            System.out.println("Array is a palindrome");
        } else System.out.println("Array is not a palindrome");

        for (int i=1; i< primeNums.length; i++) {
            if (primeNums[0] == primeNums[i]) {
                sumSameFirst += 1;
            }
        }

        System.out.println("Positive numbers count - " + sumPos);
        System.out.println("Negative numbers count - " + sumNeg);
        System.out.println("Zero numbers count - " + sumZero);
        System.out.println("First item's value to be repeated - " + sumSameFirst);
    }
}
