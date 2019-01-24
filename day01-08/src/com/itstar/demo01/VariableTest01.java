package com.itstar.demo01;

/**
* 
* 主要演示基本数据类型的变量与常量
* @author dxw
* @version 1.0
*/

public class VariableTest01{
	public static void main(String [] args){
		// 变量的定义
		int a=1;
		// 常量的定义
		final double PI = 3.1415926;
		// 变量可以进行变化
		a=20;
		// ""+表示字符串的拼接
		System.out.println("经过变化后的，a="+a);
		// 常量不可以变化
		// PI = 3.25; // 可以抢占赋值
		// 注释刻用于注释任何代码
		//System.out.println("经过变化后的，PI="+PI);


		// 开始我们的程序---自动类型转换

		System.out.println("开始我们的程序---自动类型转换");
		int i=666;
		double d;
		/*
			这一块，就是自动类型转换，因为并没有指定桨i转换你为double
			直接使用i
			i本身没有转换
			在d=i时 需要将i自动转为double型 赋给d
		*/
		d=i;
		System.out.println("转换之前i="+i);
		System.out.println("转换之后的d="+d);

		d=998.99;
		/*
			枪支类型转换 需要（）--》括号里面放需要强制转换的类型
			例如：double转int小括号就是（int）
		*/
		i=(int)d;

		System.out.println("强制转换前的d="+d);
		System.out.println("强制转换前的i="+i);

		// 强制类型转换--跨类型例如：字符串转为数字。String-->int
		String number = "123";
		number =number+1;
		System.out.println("此时的number="+number);


		// java Integer.parseInt 自带的一个 将字符串转换为int的函数
		int string_to_int = Integer.parseInt(number);
		string_to_int = string_to_int+1;//int+1
		System.out.println("强制转换后的string_to_int"+string_to_int);

		// 输出的为 字符a对应的 ascII码值。
		char c = 'a';
		int char_to_int = (int)c;
		System.out.println("枪支转换后的char_to_int="+char_to_int);
	}
}