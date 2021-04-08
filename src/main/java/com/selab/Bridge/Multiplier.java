package com.selab.Bridge;

public class Multiplier {
	private MultImp implementation;

	public Multiplier(MultImp implementation) {
		this.implementation = implementation;
	}

	public int multiply(int multiplier, int multiplicand)
	{
		return implementation.multiply(multiplier, multiplicand);
	}
}
