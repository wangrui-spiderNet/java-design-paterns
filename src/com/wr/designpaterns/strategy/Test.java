package com.wr.designpaterns.strategy;

public class Test {
	
	public static void main(String[] args) {
		
		//ֻ�������ۿ�����ʱ,ֻ��Ҫ����һ��ʵ����,������Ҫ�޸�д�õĴ���
//		IDiscountStrategy strategy=new FlatRateStrategy();
//		IDiscountStrategy strategy=new NoDiscountStrategy();
		IDiscountStrategy strategy=new PercentageStrategy();
		
		strategy.calculateDiscount(10,10);
		
	}
}
