package com.core.factory;

public interface IAnimalFactory {

	public abstract IAnimal GetAnimalType(String type) throws Exception;

}
