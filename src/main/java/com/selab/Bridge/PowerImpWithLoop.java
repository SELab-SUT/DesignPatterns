package com.selab.Bridge;

public class PowerImpWithLoop extends PowerImp {

    public PowerImpWithLoop(Multiplier multiplier) {
        super(multiplier);
    }

    @Override
    public int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}
