package com.core.observer.demo2;

interface ISubject {
	void register(IObserver o);

	void unregistrer(IObserver o);

	void notifyObservers(int i);
}