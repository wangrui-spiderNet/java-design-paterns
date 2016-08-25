package com.wr.designpaterns.factorymethod;

public class RiseFactory implements FruitFactory {

	@Override
	public Fruit creat() {
		// TODO Auto-generated method stub
		return new Rise();
	}

}
