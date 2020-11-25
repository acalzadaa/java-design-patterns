package com.core.state;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TV {
	private RemoteControl state;

	public void pressButton() {
		state.pressSwitch(this);
	}

}
