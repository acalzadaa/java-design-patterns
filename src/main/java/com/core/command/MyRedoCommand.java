package com.core.command;

public class MyRedoCommand implements ICommand {

	private Receiver receiver;

	MyRedoCommand(Receiver recv) {
		this.receiver = recv;
	}

	@Override
	public void Do() {
		receiver.performRedo();
	}

}
