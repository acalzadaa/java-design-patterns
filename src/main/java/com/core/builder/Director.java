package com.core.builder;

public class Director {
	IBuilder myBuilder;

	public void Construct(IBuilder builder) {
		myBuilder = builder;
		myBuilder.BuildBody();
		myBuilder.InsertWheels();
		myBuilder.AddHeadlights();
	}
}
