package com.selab.Decorator;

public class SteamedMilk extends CondimentDecorator {
	public SteamedMilk(Beverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " with milk";
	}

	@Override
	public double cost() {
		return 0.10 + beverage.cost();
	}
}
