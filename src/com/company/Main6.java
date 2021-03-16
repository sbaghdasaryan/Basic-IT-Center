package com.company;

public class Main6 {

    public static void main(String[] args) {
        Liquid[] liquids = { new Coffee(20, 100, 10),
                new Coctail(50, 70, 55)};

        for (Liquid liquid: liquids) {
            liquid.calcDensity();
        }
    }
}
