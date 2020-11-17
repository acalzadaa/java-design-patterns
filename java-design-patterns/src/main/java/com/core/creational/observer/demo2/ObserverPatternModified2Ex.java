package com.core.creational.observer.demo2;

public class ObserverPatternModified2Ex {
	public static void main(String[] args) {
		System.out.println("*** Modified Observer Pattern Demo***\n");
		Subject sub = new Subject();
		Observer1 ob1 = new Observer1();
		Observer2 ob2 = new Observer2();

		sub.register(ob1);
		sub.register(ob2);
		sub.setMyValue(5);

		System.out.println();
		sub.setMyValue(25);

		System.out.println();
		sub.unregistrer(ob1);

		sub.setMyValue(100);

	}
}
