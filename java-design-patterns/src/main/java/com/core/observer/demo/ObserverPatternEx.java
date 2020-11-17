package com.core.observer.demo;

public class ObserverPatternEx {
	public static void main(String[] args) {
		System.out.println("*** Observer Pattern demo ***");
		Observer o1 = new Observer();
		Subject sub1 = new Subject();
		sub1.register(o1);

		System.out.println("Set flag to 5");
		sub1.setFlag(5);

		System.out.println("Set flag to 25");
		sub1.setFlag(25);

		sub1.unregister(o1);

		System.out.println("Set flag to 10");
		sub1.setFlag(10);

	}
}
