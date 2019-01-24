package com.itstar.demo01;

/**
* 方法重载
* @author dxw
* @version 1.0
*/

public class MethodTest02{
    public static void main(String [] args){
		int a = 1;
		int b = 2;
		int c = 3;
		test(a,b);
		test(a,b,c);
		
    }
	/*
	* 写一个函数实现 HelloWorld的输出
	*/
	public static void HelloWorld(){
		
		System.out.println("HelloWorld!!!");
		return;
	}
	
	/*
		写一个函数 实现数据的求和 乘积
		要传入交换的两个值 将交换结果进行返回
		也可以调用除main意外的其他函数
	*/
	
	public static void test(int a,int b){
		System.out.println("test");
	}
	
	public static void test(int a,int b,int c){
		System.out.println("重载");
	}
}