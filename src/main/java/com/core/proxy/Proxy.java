package com.core.proxy;

public class Proxy extends Subject {
	ConcreteSubject cs;

	@Override
	public void doSomework() {
		System.out.println("Proxy call!");
		if (cs == null) {
			cs = new ConcreteSubject();
		}

		cs.doSomework();

	}

}
