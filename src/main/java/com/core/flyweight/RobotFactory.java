package com.core.flyweight;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {

	Map<String, IRobot> shapes = new HashMap<>();

	public int TotalObjectsCreated() {
		return shapes.size();
	}

	public IRobot GetRobotFromFactory(String robotCategory) throws Exception {

		IRobot irobotCategory = null;
		if (shapes.containsKey(robotCategory)) {
			irobotCategory = shapes.get(robotCategory);
		} else {
			switch (robotCategory) {
			case "small":
				System.out.println("Creating a small robot!");
				irobotCategory = new SmallRobot();
				shapes.put("small", irobotCategory);
				break;

			case "large":
				System.out.println("Creating a large robot!");
				irobotCategory = new LargeRobot();
				shapes.put("large", irobotCategory);
				break;
			default:
				throw new Exception(robotCategory + "is Invalid! Should be only <small> or <large>");
			}
		}
		return irobotCategory;

	}

}
