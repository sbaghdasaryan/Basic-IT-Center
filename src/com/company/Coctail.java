package com.company;

public class Coctail extends Liquid{
    private int spirtWeight;
    private int juiceWeight;

    Coctail(int waterWeight, int juiceWeight, int spirtWeight) {
        super(waterWeight);
        this.spirtWeight = spirtWeight;
        this.juiceWeight = juiceWeight;
    }

    @Override
    public void calcDensity() {
        System.out.println("Coctail class " + waterWeight +
                " " + juiceWeight + " " + spirtWeight);
    }
}
