package com.wr.designpaterns.strategy;

public class FlatRateStrategy implements IDiscountStrategy{

	@Override
	public void calculateDiscount(int copies, float price) {
		int discount=5;
		float sum=price*copies-discount;
		System.out.println(copies+"本FlatRateStrategy书的总价格是"+sum);
	}

}
