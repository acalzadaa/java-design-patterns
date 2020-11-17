package com.core.observer.demo;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class Subject implements ISubject {

	List<Observer> observers = new ArrayList<>();
	private int flag;

	public void setFlag(int flag) {
		this.flag = flag;
		notifyObservers();
	}

	@Override
	public void register(Observer o) {
		observers.add(o);

	}

	@Override
	public void unregister(Observer o) {
		observers.remove(o);

	}

	@Override
	public void notifyObservers() {
		observers.stream().forEach(observer -> observer.update());

	}

}
