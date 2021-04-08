package com.selab.Bridge;

public class PowerImpWithRecursion extends PowerImp{
    public PowerImpWithRecursion(Multiplier multiplier) {
        super(multiplier);
    }

    @Override
    public int power(int base, int exponent) {
        if (exponent == 0)
            return 1;
        if (exponent == 1)
            return base;
        return power(base, exponent / 2) * power(base, exponent / 2 + exponent % 2);
    }
}
