package com.core.facade;

public class FacadePatternEx {

	public static void main(String[] args) {
		RobotFacade rf1 = new RobotFacade();
		rf1.ConstructRobot("green", "iron");

		RobotFacade rf2 = new RobotFacade();
		rf2.ConstructRobot("grey", "copper");
	}

}
