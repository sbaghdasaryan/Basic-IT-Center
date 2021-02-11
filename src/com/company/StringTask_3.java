package com.company;

public class StringTask_3 {

    public static void main (String args[]) {
        String s1="abcdkl";
        String s2="cdef";
        int lengthS1 = s1.length();
        int lengthS2 = s2.length();
        boolean notExist = true;

        for (int i=0; i<lengthS2; i++) {
            for (int j=0; j<lengthS1; j++) {
                if (String.valueOf(s2.charAt(i)).equals(String.valueOf(s1.charAt(j)))) {
                    notExist = false;
                    break;
                } else {
                    notExist = true;
                }
            }
            if (notExist) {
                s1 = s1 + s2.charAt(i);
            }
        }
        System.out.println(s1);
    }
}
