package com.selab.Decorator;

public abstract class Beverage {
	protected String description;

	public String getDescription()
	{
		return "Delicious " + description;
	}

	public abstract double cost();
}
