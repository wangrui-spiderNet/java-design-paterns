package com.wr.designpaterns.factorymethod;

public class Tomato implements Fruit{

	@Override
	public void grow() {
		LogUtil.log("Tomato","grow");
	}

	@Override
	public void seed() {
		LogUtil.log("Tomato","seed");
	}

	@Override
	public void harvest() {
		LogUtil.log("Tomato","harvest");
	}

}
