package com.wr.designpaterns.strategy;

public class PercentageStrategy implements IDiscountStrategy {

	@Override
	public void calculateDiscount(int copies, float price) {
		float discount=(float) 0.7;
		float sum=price*copies*discount;
		System.out.println(copies+"��PercentageStrategy����ܼ۸���"+sum);
	}

}
