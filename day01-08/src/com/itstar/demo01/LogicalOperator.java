package com.itstar.demo01;

/**
逻辑运算符
@author DXW
@version 1.0
*/
public class LogicalOperator{

	public static void main(String [] args){
		int a= 1;
		int b= 2;
		
		// &不具备短路功能 所以b++ 会执行 则b=3
		// a>b 为 false 则整个 flag为false
		boolean flag =a>b & b++>=2;
		System.out.println("flag="+flag+",b="+b);
		// && 具有短路功能 flag 为false b++不执行 b=3依旧不变
		flag = a>b&& b++>=2;
		System.out.println("flag="+flag+",b="+b);
		
		
		
		/**
			逻辑或
		*/
		flag = a<b|b++>=2;
		System.out.println("flag="+flag+",b="+b);
		flag = a<b||b++>=2;
		System.out.println("flag="+flag+",b="+b);
		
		
		/**
		逻辑非
		*/
		System.out.println("!flag="+!flag);
	}

}