package com.core.chain;

public class FaxErrorHandler implements IReceiver {
	private IReceiver receiver;

	public FaxErrorHandler(IReceiver nextReceiver) {
		receiver = nextReceiver;
	}

	public Boolean ProcessMessage(Message msg) {
		if (msg.text.contains("Fax")) {
			System.out.println("FaxErrorHandler processed " + msg.priority + "priority issue: " + msg.text);
			return true;
		} else {
			if (receiver != null)
				receiver.ProcessMessage(msg);
		}
		return false;
	}
}
