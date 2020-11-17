package com.core.singleton;

public class Singleton {

	private static Singleton single;

	private Singleton() {
	}

	private static class SingletonHelper {
		private static final Singleton single = new Singleton();
	}

	public static Singleton getSingle() {
		return SingletonHelper.single;
	}
}
