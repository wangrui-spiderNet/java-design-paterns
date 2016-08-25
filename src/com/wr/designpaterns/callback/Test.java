package com.wr.designpaterns.callback;

public class Test {

	public static void main(String[] args) {
		
		CheckBox checkBox=new CheckBox();
		
		boolean isChecked=false;
		
		checkBox.setOnCheckedListner(isChecked,new OnCheckedListner() {
			
			@Override
			public void isChecked() {
				System.out.println("ִ�гɹ�!");
			}
			
			@Override
			public void isNotChecked() {
				System.out.println("ִ��ʧ��!");
			}
			
		});
		
		checkBox.setOnClickListner(new OnClickListner() {
			
			@Override
			public void onClick() {
				System.out.println("����¼�!");
			}
		});
	}
	
}
