package com.itstar.demo01;

/**
* 条件控制语句 if else 并不是 所有的语句都执行，有选择的执行
可以实现 三元运算符的转换
*/
public class IfElseTest{
	public static void main(String [] args){
		/**int c=(2>2?0:1)*/
		int c;
		int a=1;
		if(a>2){
			c=0;
			System.out.println("满足条件时执行");
		}else{
			c=1;
			System.out.println("不满足条件时执行");
		}
		System.out.println("c="+c);
	}
}