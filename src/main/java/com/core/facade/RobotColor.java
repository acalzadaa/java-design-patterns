package com.core.facade;

import lombok.Data;

@Data
public class RobotColor {
	private String color;

	public void SetColor(String color) {
		this.color = color;
		System.out.println("Color is set to: " + this.color);
	}
}
