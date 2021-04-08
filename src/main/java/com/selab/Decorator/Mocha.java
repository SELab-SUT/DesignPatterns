package com.selab.Decorator;

public class Mocha extends CondimentDecorator {
	public Mocha(Beverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " with mocha";
	}

	@Override
	public double cost() {
		return 0.20 + beverage.cost();
	}
}
