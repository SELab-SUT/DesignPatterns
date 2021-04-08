package com.selab.Decorator;

public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "DarkRoast";
	}

	@Override
	public double cost() {
		return 0.99;
	}
}
