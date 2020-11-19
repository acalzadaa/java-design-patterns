package com.core.strategy;

public class Context {

	IChoice choice;

	public void SetChoice(IChoice choice) {
		this.choice = choice;
	}

	public void ShowChoice(String s1, String s2) {
		choice.myChoice(s1, s2);
	}

}
