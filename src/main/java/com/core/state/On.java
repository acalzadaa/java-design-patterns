package com.core.state;

public class On extends RemoteControl {

	@Override
	public void pressSwitch(TV context) {
		context.setState(new Off());
		System.out.println("Turning off");
	}

}
