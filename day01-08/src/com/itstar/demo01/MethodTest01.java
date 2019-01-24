package com.itstar.demo01;

/**
* 方法函数
* @author dxw
* @version 1.0
*/

public class MethodTest01{
    public static void main(String [] args){
		
		int a = 88;
		int b = 99;
		int [] arr2 = new int[2];
		// main 函数中 args 可以接受参数
		for(int i = 0;i<args.length;i++){
			System.out.println(args[i]);
			
		}
		// 主函数作为程序的入口 可以条用其他函数来运行
		HelloWorld();
		
		arr2 = process(a, b);
		System.out.println("加法="+arr2[0]);
		System.out.println("乘法="+arr2[1]);
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
	
	public static int[] process(int a,int b){
		int [] arr = new int [2];
		arr[0] = a+b;
		arr[1] = a*b;
		
		return arr;
	}
	
	
}