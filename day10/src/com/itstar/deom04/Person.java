package com.itstar.deom04;

public class Person {
	/*姓名*/
	private String name;
	/*性别*/
	private char sex;
	/*年龄*/
	private int age;
	

	/* 定义构造函数 */
	// 无参的构造函数
	public Person(){
		System.out.println("1、无参构造函数没有返回类型！");
	}
	
	// 一个参数的构造函数
	public Person(String _name){
		name =_name;
		System.out.println("2、1个参数的构造函数。name="+name);
	}
	
	// 一个参数的构造函数
	public Person(String _name, char _sex, int _age){
		// 构造函数中 可以对初始化的内容进行验证
		// _下划线可以对成员变量进行区分
		name =_name;
		sex =_sex;
		age =_age;
		System.out.println("3、3个参数的构造函数。name="+name+"、sex="+sex+"、age="+age);
	}

	// show
	public void show(){
		System.out.println("大家好我是"+name+"。"+sex+"，今年"+age+"岁！");
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
