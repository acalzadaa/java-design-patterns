package com.core.bridge;

public class RedColor implements IColor {

	@Override
	public void fillWithColor(int border) {
		System.out.println("Red Color with " + border + " inch border");

	}

}
