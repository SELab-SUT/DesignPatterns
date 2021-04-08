package com.selab.Bridge;

public class MultImpWithAdd implements MultImp{
	@Override
	public int multiply(int multiplier, int multiplicand) {
		boolean negativeResult = multiplier < 0 ^ multiplicand < 0;
		multiplier = Math.abs(multiplier);
		multiplicand = Math.abs(multiplicand);
		int result = 0;

		while (multiplier-- > 0)
			result += multiplicand;

		if (negativeResult)
			result = -result;

		return result;
	}
}
