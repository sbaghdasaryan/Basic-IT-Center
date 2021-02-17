package com.company;

public class Methods_RepString {

    public static void main(String args[]) {
        String[] strings = {"qweqrty", "asdfsgh", "zxcvbnz"};

        for (int i=0; i<strings.length; i++) {
            repString(strings[i]);
        }
    }

    static void repString(String string) {

        for (int i=1; i<string.length(); i++) {
            if (string.charAt(0) == string.charAt(i)) {
                System.out.println(string);
                break;
            }
        }
    }
}
