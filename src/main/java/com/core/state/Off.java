package com.core.state;

public class Off extends RemoteControl {

	@Override
	public void pressSwitch(TV context) {
		context.setState(new On());
		System.out.println("Turning on");

	}

}
