package com.company;

public class StringTask_1 {

    public static void main (String args[]) {
        String s = "6+7+8+9+5+23+56";
        int sum = 0;
        String result;
        String[] strings = s.split("\\+");

        for (String string: strings) {
            int i = Integer.parseInt(string);
            sum += i;
        }

        result = String.valueOf(sum);
        System.out.println(result);
    }
}
