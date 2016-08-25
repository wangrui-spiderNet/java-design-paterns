package com.wr.designpaterns.callback;
/**
 * 选中事件会掉接口
 * @author wangrui
 *
 */
public interface OnCheckedListner {
   //选中事件
   void isChecked();
   //未选中事件
   void isNotChecked();
}
