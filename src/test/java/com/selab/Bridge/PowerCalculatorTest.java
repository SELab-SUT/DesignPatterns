package com.selab.Bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowerCalculatorTest {
    private PowerCalculator powerCalculator;
    private PowerImp powerImp;
    static final int OPERAND1 = 6;
    static final int OPERAND2 = 5;
    static final int ZERO = 0;

    @Test
    void PowerImpWithLoop_MultImpWithAdd_IffPowerIsNotZero() {
        powerImp = new PowerImpWithLoop(new Multiplier(new MultImpWithAdd()));
        powerCalculator = new PowerCalculator(powerImp);
        int actualResult = powerCalculator.power(OPERAND1, OPERAND2);
        final int EXPECTED_RESULT = (int) Math.round(Math.pow(OPERAND1, OPERAND2));
        assertEquals(EXPECTED_RESULT, actualResult);
    }

    @Test
    void PowerImpWithLoop_MultImpWithMult_IffPowerIsNotZero() {
        powerImp = new PowerImpWithLoop(new Multiplier(new MultImpWithMult()));
        powerCalculator = new PowerCalculator(powerImp);
        int actualResult = powerCalculator.power(OPERAND1, OPERAND2);
        final int EXPECTED_RESULT = (int) Math.round(Math.pow(OPERAND1, OPERAND2));
        assertEquals(EXPECTED_RESULT, actualResult);
    }

    @Test
    void PowerImpWithRecursion_MultImpWithAdd_IffPowerIsNotZero() {
        powerImp = new PowerImpWithRecursion(new Multiplier(new MultImpWithAdd()));
        powerCalculator = new PowerCalculator(powerImp);
        int actualResult = powerCalculator.power(OPERAND1, OPERAND2);
        final int EXPECTED_RESULT = (int) Math.round(Math.pow(OPERAND1, OPERAND2));
        assertEquals(EXPECTED_RESULT, actualResult);
    }

    @Test
    void PowerImpWithRecursion_MultImpWithMult_IffPowerIsNotZero() {
        powerImp = new PowerImpWithRecursion(new Multiplier(new MultImpWithMult()));
        powerCalculator = new PowerCalculator(powerImp);
        int actualResult = powerCalculator.power(OPERAND1, OPERAND2);
        final int EXPECTED_RESULT = (int) Math.round(Math.pow(OPERAND1, OPERAND2));
        assertEquals(EXPECTED_RESULT, actualResult);
    }

    @Test
    void PowerImpWithLoop_MultImpWithAdd_IffPowerIsZero() {
        powerImp = new PowerImpWithLoop(new Multiplier(new MultImpWithAdd()));
        powerCalculator = new PowerCalculator(powerImp);
        int actualResult = powerCalculator.power(OPERAND1, ZERO);
        final int EXPECTED_RESULT = 1;
        assertEquals(EXPECTED_RESULT, actualResult);
    }

    @Test
    void PowerImpWithLoop_MultImpWithMult_IffPowerIsZero() {
        powerImp = new PowerImpWithLoop(new Multiplier(new MultImpWithMult()));
        powerCalculator = new PowerCalculator(powerImp);
        int actualResult = powerCalculator.power(OPERAND1, ZERO);
        final int EXPECTED_RESULT = 1;
        assertEquals(EXPECTED_RESULT, actualResult);
    }

    @Test
    void PowerImpWithRecursion_MultImpWithAdd_IffPowerIsZero() {
        powerImp = new PowerImpWithRecursion(new Multiplier(new MultImpWithAdd()));
        powerCalculator = new PowerCalculator(powerImp);
        int actualResult = powerCalculator.power(OPERAND1, ZERO);
        final int EXPECTED_RESULT = 1;
        assertEquals(EXPECTED_RESULT, actualResult);
    }

    @Test
    void PowerImpWithRecursion_MultImpWithMult_IffPowerIsZero() {
        powerImp = new PowerImpWithRecursion(new Multiplier(new MultImpWithMult()));
        powerCalculator = new PowerCalculator(powerImp);
        int actualResult = powerCalculator.power(OPERAND1, ZERO);
        final int EXPECTED_RESULT = 1;
        assertEquals(EXPECTED_RESULT, actualResult);
    }
}
