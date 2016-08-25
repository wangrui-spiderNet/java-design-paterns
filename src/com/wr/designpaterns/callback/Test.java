package com.wr.designpaterns.callback;

public class Test {

	public static void main(String[] args) {
		
		CheckBox checkBox=new CheckBox();
		
		boolean isChecked=false;
		
		checkBox.setOnCheckedListner(isChecked,new OnCheckedListner() {
			
			@Override
			public void isChecked() {
				System.out.println("执行成功!");
			}
			
			@Override
			public void isNotChecked() {
				System.out.println("执行失败!");
			}
			
		});
		
		checkBox.setOnClickListner(new OnClickListner() {
			
			@Override
			public void onClick() {
				System.out.println("点击事件!");
			}
		});
	}
	
}
