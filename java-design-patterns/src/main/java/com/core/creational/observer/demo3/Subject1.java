package com.core.creational.observer.demo3;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
class Subject1 implements ISubject {

	private int myValue;
	List<IObserver> observers = new ArrayList<>();

	public void setMyValue(int myValue) {
		this.myValue = myValue;
		notifyObservers(myValue);
	}

	@Override
	public void register(IObserver o) {
		observers.add(o);
	}

	@Override
	public void unregister(IObserver o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers(int i) {
		observers.stream().forEach(observer -> observer.update(this.getClass().getSimpleName(), i));
	}

}
