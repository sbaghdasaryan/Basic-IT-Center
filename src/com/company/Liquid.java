package com.company;

abstract public class Liquid {
    protected int waterWeight;

    Liquid(int waterWeight) {
        this.waterWeight = waterWeight;
    }

    abstract public void calcDensity();
}
