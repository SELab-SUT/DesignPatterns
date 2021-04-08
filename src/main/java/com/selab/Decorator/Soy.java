package com.selab.Decorator;

public class Soy extends CondimentDecorator {
	public Soy(Beverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " with soy";
	}

	@Override
	public double cost() {
		return 0.15 + beverage.cost();
	}
}
