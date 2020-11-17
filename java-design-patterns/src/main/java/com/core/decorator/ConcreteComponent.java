package com.core.decorator;

public class ConcreteComponent extends Component {

	@Override
	public void doJob() {
		System.out.println("Concrete component - closed for modification");

	}

}
