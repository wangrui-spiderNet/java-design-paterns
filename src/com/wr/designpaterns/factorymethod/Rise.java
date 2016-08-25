package com.wr.designpaterns.factorymethod;

public class Rise implements Fruit{

	@Override
	public void grow() {
		LogUtil.log("Rise","grow");
	}

	@Override
	public void seed() {
		LogUtil.log("Rise","seed");
	}

	@Override
	public void harvest() {
		LogUtil.log("Rise","harvest");
	}

}
