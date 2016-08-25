package com.wr.designpaterns.factorymethod;

public class TomatoFactory implements FruitFactory{

	@Override
	public Fruit creat() {
		// TODO Auto-generated method stub
		return new Tomato();
	}

}
