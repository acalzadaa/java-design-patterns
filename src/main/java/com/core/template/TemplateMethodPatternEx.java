package com.core.template;

public class TemplateMethodPatternEx {

	public static void main(String[] args) {
		System.out.println("Template Method Demo");
		BasicEngineering bs = new ComputerScience();
		bs.Papers();

		bs = new Electronics();

		bs.Papers();

	}

}
