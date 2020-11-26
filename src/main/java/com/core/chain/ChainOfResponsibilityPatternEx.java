package com.core.chain;

public class ChainOfResponsibilityPatternEx {
	public static void main(String[] args) {
		System.out.println("***Chain of Responsibility Pattern Demo***\n");

		// Making the chain first: IssueRaiser->FaxErrorhandler->EmailErrorHandler
		IReceiver faxHandler, emailHandler;

		// end of chain
		emailHandler = new EmailErrorHandler(null);

		// fax handler is before email
		faxHandler = new FaxErrorHandler(emailHandler);

		// starting point: raiser will raise issues and set the first handler
		IssueRaiser raiser = new IssueRaiser(faxHandler);

		Message m1 = new Message("Fax is reaching late to the destination", MessagePriority.NORMAL);
		Message m2 = new Message("Email is not going", MessagePriority.HIGH);
		Message m3 = new Message("In Email, BCC field is disabled occasionally", MessagePriority.NORMAL);
		Message m4 = new Message("Fax is not reaching destination", MessagePriority.HIGH);

		raiser.RaiseMessage(m1);
		raiser.RaiseMessage(m2);
		raiser.RaiseMessage(m3);
		raiser.RaiseMessage(m4);
	}
}
