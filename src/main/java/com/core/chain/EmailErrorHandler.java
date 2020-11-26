package com.core.chain;

public class EmailErrorHandler implements IReceiver {

	private IReceiver nextReceiver;

	public EmailErrorHandler(IReceiver nextReceiver) {
		this.nextReceiver = nextReceiver;
	}

	public Boolean ProcessMessage(Message msg) {
		if (msg.text.contains("Email")) {
			System.out.println("EmailErrorHandler processed " + msg.priority + "priority issue: " + msg.text);
			return true;
		} else {
			if (nextReceiver != null)
				nextReceiver.ProcessMessage(msg);
		}
		return false;
	}

}
