package com.selab.Bridge;

public class PowerCalculator {
    private PowerImp implementation;


    public PowerCalculator(PowerImp implementation) {
        this.implementation = implementation;
    }

    public int power(int base, int exponent) {
        return implementation.power(base, exponent);
    }
}
