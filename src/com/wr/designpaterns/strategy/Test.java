package com.wr.designpaterns.strategy;

public class Test {
	
	public static void main(String[] args) {
		
		//只当增加折扣种类时,只需要增加一个实现类,而不需要修改写好的代码
//		IDiscountStrategy strategy=new FlatRateStrategy();
//		IDiscountStrategy strategy=new NoDiscountStrategy();
		IDiscountStrategy strategy=new PercentageStrategy();
		
		strategy.calculateDiscount(10,10);
		
	}
}
