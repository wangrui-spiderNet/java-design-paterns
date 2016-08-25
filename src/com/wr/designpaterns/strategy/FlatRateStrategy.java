package com.wr.designpaterns.strategy;

public class FlatRateStrategy implements IDiscountStrategy{

	@Override
	public void calculateDiscount(int copies, float price) {
		int discount=5;
		float sum=price*copies-discount;
		System.out.println(copies+"��FlatRateStrategy����ܼ۸���"+sum);
	}

}
