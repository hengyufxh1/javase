package com.itstar.demo01;

public class AnimalStaticTest {
	public static void main(String[] args) {
		// 声明一个对象 没有进行实例化 初始化对象
		Animal.weight = 100.0;
		// 不需要实例化
		Animal.cry();
		Animal animal = new Animal();
		// weight 使用 public static 修饰的所以可以直接访问
		animal.weight = 300.0;
		// 只有实例化才可以使用
		animal.bigcry();
		// 通过 类名直接访问 而sex 无法通过类名直接访问
		
		// 初始化 实例化 对象
		Animal animal2 = new Animal();
		animal.weight = 400.0;
		
		// sex只有实例化后才可以被访问
		animal2.sex='公';
		Animal animal3 = new Animal();
		animal.weight = 500.0;
		// 因为 static 是从类加载的时候就运行 animal的weight
		// 会一样
		System.out.println(animal.weight);
		animal.weight = 500.0;
		System.out.println(animal2.weight);
		System.out.println(animal3.weight);
	}
}
