package com.core.observer.demo3;

interface ISubject {
	void register(IObserver o);

	void unregister(IObserver o);

	void notifyObservers(int i);
}