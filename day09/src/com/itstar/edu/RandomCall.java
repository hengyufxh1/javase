package com.itstar.edu;

import java.util.Random;

public class RandomCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 存储学生的姓名
		String[] StuNames = new String[5];
		// step1 动态初始化学生姓名
		addStudent(StuNames);
		
		// step2 产生随机数
		for (int count = 0; count < 10; count++) {
			String name = randCall(StuNames);
			System.out.println("第"+count+"次点名是："+name);
		}
	}
	
	/*
	 * 实现学生姓名的初始化
	 * */
	public static void addStudent(String[] StuNames){
		for (int i = 0; i < StuNames.length; i++) {
			StuNames[i] = "张"+i;
		}
	}
	
	/*
	 * 实现随机点名
	 * @return 返回随机点到的名字 String
	 * @param 学生名字初始化的数组
	 * */
	
	public static String randCall(String [] StuNames){
		// 使用 random类
		Random rand = new Random();
		
		// 生成随机数 0-length -1
		int index=rand.nextInt(StuNames.length);
		String name = StuNames[index];
		return name;
	}

}
