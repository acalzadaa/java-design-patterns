package com.core.creational.observer.demo2;

public class Observer2 implements IObserver {

	@Override
	public void update(int i) {
		System.out.println("Observer2-my value is now: " + i);
	}

}
