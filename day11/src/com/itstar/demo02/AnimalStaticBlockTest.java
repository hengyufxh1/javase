package com.itstar.demo02;

public class AnimalStaticBlockTest {
	public static void main(String[] args) {
		// 初始化一个对象 静态构造代码块 执行 且执行一次 
		// 所以输出只有一次
		// 静态构造代码块里的变量也就只有一次
//		Animal animal = new Animal();
//		Animal animal2 = new Animal();
//		Animal animal3 = new Animal();
//		System.out.println(animal.height);
		
		// 输出顺序
		Animal animal = new Animal();
		Animal animal1 = new Animal();
		
	}
}
