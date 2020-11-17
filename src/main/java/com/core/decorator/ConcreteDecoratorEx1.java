package com.core.decorator;

public class ConcreteDecoratorEx1 extends AbstractDecorator {

	public void doJob() {
		super.doJob();
		System.out.println("explicit from ex1");
	}

}
