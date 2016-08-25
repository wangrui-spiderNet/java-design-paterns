package com.wr.designpaterns.factorymethod;

public class Potato implements Fruit{

	@Override
	public void grow() {
		LogUtil.log("Potato","grow");
	}

	@Override
	public void seed() {
		LogUtil.log("Potato","seed");
	}

	@Override
	public void harvest() {
		LogUtil.log("Potato","harvest");
	}

}
