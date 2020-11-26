package com.core.mediator;

public class Friend1 extends Friend {
	public Friend1(Mediator mediator, String name) {
		super(mediator);
		this.name = name;
	}

	public void Send(String msg) {
		mediator.send(this, msg);
	}

	public void Notify(String msg) {
		System.out.println(name + "gets message: " + msg);
	}
}
