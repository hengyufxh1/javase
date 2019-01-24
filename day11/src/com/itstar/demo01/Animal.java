package com.itstar.demo01;

public class Animal {

	// 动物的属性 成员变量 封装private 
	private String name;
	public char sex;
	// 用static 修饰的成员变量
	private static String move="会动";
	public static double weight = 200.0;
	
	// 构造函数 -- 无参构造函数
	public Animal(){
		
	}
	
	// 定义一个静态方法
	public static void cry(){
		//静态方法不能够使用非静态的变量
//		System.out.println(name+"is crying");
		// 静态方法 只能使用静态变量
		// 静态可以直接调用
		System.out.println(move+weight+"is crying");
	}
	
	// 定义一个非静态方法
	public void bigcry(){
		// 非静态方法可以随便使用静态变量和费静态变量
		// 静态变量是斜体
		System.out.println(move);
		System.out.println(name);
		System.out.println(weight);
	}
}

