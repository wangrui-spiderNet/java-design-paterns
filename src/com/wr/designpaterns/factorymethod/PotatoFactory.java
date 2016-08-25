package com.wr.designpaterns.factorymethod;

public class PotatoFactory implements FruitFactory{

	@Override
	public Fruit creat() {
		
		return new Potato();
	}

}
