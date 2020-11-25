package com.core.memento;

public class Caretaker {
	private Memento memento;

	public void SaveMemento(Memento m) {
		memento = m;
	}

	public Memento RetrieveMemento() {
		return memento;
	}
}
