package com.core.mediator;

public class Boss extends Friend {
	public Boss(Mediator mediator, String name) {
		super(mediator);
		this.name = name;
	}

	public void Send(String msg) {
		mediator.send(this, msg);
	}

	public void Notify(String msg) {
		System.out.println("\nBoss sees message: " + msg);
		System.out.println("");
	}
}
