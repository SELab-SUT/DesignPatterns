package com.selab.Bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplierTest {
	private Multiplier multiplier;
	private MultImp implementation;
	static final int OPERAND1 = 4;
	static final int OPERAND2 = 6;
	static final int NEGATIVE_OPERAND1 = -5;
	static final int NEGATIVE_OPERAND2 = -8;

	@Test
	void MultImpWithAdd_MultipliesTwoNumbers_IfBothOperandsArePositive()
	{
		implementation = new MultImpWithAdd();
		multiplier = new Multiplier(implementation);
		int actualResult = multiplier.multiply(OPERAND1, OPERAND2);
		final int EXPECTED_RESULT = OPERAND1 * OPERAND2;
		assertEquals(EXPECTED_RESULT, actualResult);
	}

	@Test
	void MultImpWithAdd_MultipliesTwoNumbers_IfFirstOperandIsNegative()
	{
		implementation = new MultImpWithAdd();
		multiplier = new Multiplier(implementation);
		int actualResult = multiplier.multiply(NEGATIVE_OPERAND1, OPERAND2);
		final int EXPECTED_RESULT = NEGATIVE_OPERAND1 * OPERAND2;
		assertEquals(EXPECTED_RESULT, actualResult);
	}

	@Test
	void MultImpWithAdd_MultipliesTwoNumbers_IfSecondOperandIsNegative()
	{
		implementation = new MultImpWithAdd();
		multiplier = new Multiplier(implementation);
		int actualResult = multiplier.multiply(OPERAND1, NEGATIVE_OPERAND2);
		final int EXPECTED_RESULT = OPERAND1 * NEGATIVE_OPERAND2;
		assertEquals(EXPECTED_RESULT, actualResult);
	}

	@Test
	void MultImpWithAdd_MultipliesTwoNumbers_IfBothOperandsAreNegative()
	{
		implementation = new MultImpWithAdd();
		multiplier = new Multiplier(implementation);
		int actualResult = multiplier.multiply(NEGATIVE_OPERAND1, NEGATIVE_OPERAND2);
		final int EXPECTED_RESULT = NEGATIVE_OPERAND1 * NEGATIVE_OPERAND2;
		assertEquals(EXPECTED_RESULT, actualResult);
	}

	@Test
	void MultImpWithMult_MultipliesTwoNumbers_IfBothOperandsArePositive()
	{
		implementation = new MultImpWithMult();
		multiplier = new Multiplier(implementation);
		int actualResult = multiplier.multiply(OPERAND1, OPERAND2);
		final int EXPECTED_RESULT = OPERAND1 * OPERAND2;
		assertEquals(EXPECTED_RESULT, actualResult);
	}

	@Test
	void MultImpWithMult_MultipliesTwoNumbers_IfFirstOperandIsNegative()
	{
		implementation = new MultImpWithMult();
		multiplier = new Multiplier(implementation);
		int actualResult = multiplier.multiply(NEGATIVE_OPERAND1, OPERAND2);
		final int EXPECTED_RESULT = NEGATIVE_OPERAND1 * OPERAND2;
		assertEquals(EXPECTED_RESULT, actualResult);
	}

	@Test
	void MultImpWithMult_MultipliesTwoNumbers_IfSecondOperandIsNegative()
	{
		implementation = new MultImpWithMult();
		multiplier = new Multiplier(implementation);
		int actualResult = multiplier.multiply(OPERAND1, NEGATIVE_OPERAND2);
		final int EXPECTED_RESULT = OPERAND1 * NEGATIVE_OPERAND2;
		assertEquals(EXPECTED_RESULT, actualResult);
	}

	@Test
	void MultImpWithMult_MultipliesTwoNumbers_IfBothOperandsAreNegative()
	{
		implementation = new MultImpWithMult();
		multiplier = new Multiplier(implementation);
		int actualResult = multiplier.multiply(NEGATIVE_OPERAND1, NEGATIVE_OPERAND2);
		final int EXPECTED_RESULT = NEGATIVE_OPERAND1 * NEGATIVE_OPERAND2;
		assertEquals(EXPECTED_RESULT, actualResult);
	}
}
