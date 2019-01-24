package com.itstar.demo04;
/**
 * person的子类演示方法的重写
 * super关键字
 * @author DXW
 *
 */
public class Person {
	/*姓名*/
	private String name;
	/*性别*/
	private char sex;
	/*年龄*/
	private int age;
	
	public double money = 10000.0;

	// 三个参数的构造函数
	public Person(String name, int age, char sex){
		// 构造函数中 可以对初始化的内容进行验证
		// _下划线可以对成员变量进行区分
		this.name = name;
		this.sex = sex;
		this.age = age;
		 System.out.println("调用父类的构造函数");
	}

	// show
	public void show(){
		System.out.println("父类的show方法");
		System.out.println("大家好，我是"+name+"，年方"+age);
	}
	/*
	 * 自动getters setters
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
