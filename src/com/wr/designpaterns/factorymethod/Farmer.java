package com.wr.designpaterns.factorymethod;
/**
 * 工厂方法测试类
 * @author wangrui
 *
 */
public class Farmer {
	static FruitFactory riseFactory,potatoFactory,tomatoFactory;
	static Fruit rise,potato,tomato;
	public static void main(String[] args) {

		riseFactory=new RiseFactory();
		potatoFactory=new PotatoFactory();
		tomatoFactory=new TomatoFactory();
		
		rise=riseFactory.creat();
		potato=potatoFactory.creat();
		tomato=tomatoFactory.creat();
		
		rise.seed();
		rise.grow();
		rise.harvest();
		
		potato.seed();
		potato.grow();
		potato.harvest();
		
		tomato.seed();
		tomato.grow();
		tomato.harvest();
	}
}
