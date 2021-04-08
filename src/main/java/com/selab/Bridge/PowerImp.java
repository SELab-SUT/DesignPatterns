package com.selab.Bridge;

public abstract class PowerImp {
    protected Multiplier multiplier;

    public PowerImp(Multiplier multiplier) {
        this.multiplier = multiplier;
    }

    public abstract int power(int base, int exponent);
}
