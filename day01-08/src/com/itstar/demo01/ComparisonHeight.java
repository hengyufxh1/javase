package com.itstar.demo01;

import java.util.Scanner;

/**
 * 通过键盘获得 身高 然后进行比较
 * 键盘获得输入 通过Scanner类来获得
 * @author DXW
 * @version 1.0
 */
 
 public class ComparisonHeight{
	public static void main(String [] args){
		// 1获得身高的输入
		Scanner scan = new Scanner(System.in);// 获得键盘输入的类
		
		System.out.println("请输入A的身高（cm为单位，整数）：");
		int height_A=scan.nextInt();
		
		System.out.println("请输入A的身高（cm为单位，整数）：");
		int height_B=scan.nextInt();
		
		System.out.println("A的身高是否大于等于B的身高："+(height_A>height_B));
	}
 }