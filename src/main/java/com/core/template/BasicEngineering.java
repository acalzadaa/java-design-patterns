package com.core.template;

public abstract class BasicEngineering {

	public void Papers() {
		Math();
		SoftSkills();
		SpecialPaper();
	}

	public abstract void SpecialPaper();

	private void SoftSkills() {
		System.out.println("SoftSkills!");
	}

	private void Math() {
		System.out.println("Math!");
	}

}
