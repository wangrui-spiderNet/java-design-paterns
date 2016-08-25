package com.wr.designpaterns.callback;
/**
 * —°‘Ò∞¥≈•¿‡
 * @author wangrui
 *
 */
public class CheckBox {

	public void setOnCheckedListner(boolean isChecked, OnCheckedListner listner){
		
		if (isChecked) {
			listner.isChecked();
		}else{
			listner.isNotChecked();
		}
	}
	
	public void setOnClickListner(OnClickListner listner){
		listner.onClick();
	}
	
}
