package com.core.creational.observer.demo2;

public class Observer1 implements IObserver {

	@Override
	public void update(int i) {
		System.out.println("Observer1-my value is now: " + i);
	}

}
