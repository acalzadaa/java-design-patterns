package com.core.builder;

import java.util.LinkedList;

import lombok.Data;

@Data
public class Product {
	private LinkedList<String> parts = new LinkedList<String>();

	public void Add(String part) {
		parts.add(part);
	}

	public void Show() {
		System.out.println("BOM..");
		parts.stream().forEach(p -> System.out.println(p));
	}
}
