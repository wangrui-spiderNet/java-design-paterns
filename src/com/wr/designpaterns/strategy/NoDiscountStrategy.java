package com.wr.designpaterns.strategy;

public class NoDiscountStrategy implements IDiscountStrategy{

	@Override
	public void calculateDiscount(int copies, float price) {
		float sum=price*copies;
		System.out.println(copies+"本NoDiscountStrategy书的总价格是"+sum);
	}

}
