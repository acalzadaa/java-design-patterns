package com.core.command;

public class CommandPatternEx {

	public static void main(String[] args) {
		System.out.println("Command Pattern Demo");

		Receiver intentedRecv = new Receiver();

		Invoke inv = new Invoke();

		MyUndoCommand unCmd = new MyUndoCommand(intentedRecv);
		MyRedoCommand reCmd = new MyRedoCommand(intentedRecv);

		inv.ExecuteCommand(unCmd);
		inv.ExecuteCommand(reCmd);
	}

}
