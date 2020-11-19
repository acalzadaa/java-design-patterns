package com.core.command;

public class MyUndoCommand implements ICommand {

	private Receiver receiver;

	MyUndoCommand(Receiver recv) {
		this.receiver = recv;
	}

	@Override
	public void Do() {
		receiver.performUndo();
	}

}
