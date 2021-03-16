package com.company;

public class Coffee extends Liquid{
    private int coffeeWeight;
    private int sugarWeigth;

    Coffee(int waterWeight, int coffeeWeight, int sugarWeigth) {
        super(waterWeight);
        this.sugarWeigth = sugarWeigth;
        this.coffeeWeight = coffeeWeight;
    }

    @Override
    public void calcDensity() {
        System.out.println("Coffee class " + waterWeight +
                " " + coffeeWeight + " " + sugarWeigth);
    }
}
