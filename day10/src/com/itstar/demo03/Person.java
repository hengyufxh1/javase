package com.itstar.demo03;

import com.itstar.demo01.Drinks;

/**
 * 演示买汽水 --定义一个人类
 * @author smart-dxw
 *
 */
public class Person {
	// 姓名
	private String name;
	// 性别
	private char sex;
	//年龄
	private int age;
	/*成员方法*/
	
	
	// 自动生成 get set方法

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public char getSex(){
		return sex;
	}
	
	public void setSex(char _sex){
		if(_sex=='男'|| _sex=='女'){
			sex =_sex;
		}else{
			System.out.println("对不起，设置失败，性别只能是男或女！");
		}
	}
	
	/*
	 * 生成性别的赋值方法 实现 验证
	 * */
	public void eat(){
		System.out.println(name+"在吃饭");
	}
	
	public void drink(){
		System.out.println(name+"在喝饮料");
	}
	
	public void buy(Drinks drink){
		System.out.println(name+"买了一瓶"+drink.brand+"花了"+drink.price+"元。");
	}
}
