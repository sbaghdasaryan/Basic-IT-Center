package com.company;

public class ArrayTask_3 {

    public static void main(String[] args) {
        int[] primeNums = {20,8,13,150,0,2,0,4,13,-5,3};

        for (int i=0; i< primeNums.length; i++) {
            boolean isPrime = true;

            for (int j=2; j<primeNums[i]; j++) {
                if(primeNums[i]%j == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                System.out.println(primeNums[i]);
            }
        }
    }
}
