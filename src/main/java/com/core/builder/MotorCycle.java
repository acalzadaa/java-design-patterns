package com.core.builder;

public class MotorCycle implements IBuilder {

	private Product product = new Product();

	@Override
	public void BuildBody() {
		product.Add("Body of a Motorcycle");

	}

	@Override
	public void InsertWheels() {
		product.Add("Adding 2 wheels");

	}

	@Override
	public void AddHeadlights() {
		product.Add("Adding 1 headlight");

	}

	@Override
	public Product GetVehicle() {
		// TODO Auto-generated method stub
		return product;
	}

}
