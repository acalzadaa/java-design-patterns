package com.core.prototype;

import java.util.Random;

import lombok.Data;

@Data
public abstract class BasicCar implements Cloneable {

	public String modelName;
	public int price;

	public BasicCar clone() throws CloneNotSupportedException {
		return (BasicCar) super.clone();
	}

	public static int setPrice() {
		int price = 0;
		Random r = new Random();
		int p = r.nextInt(100000);
		price = p;
		return price;
	}

}
