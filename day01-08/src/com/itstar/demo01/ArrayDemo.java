package com.itstar.demo01;

/**
* 数组
* @author dxw
* @version 1.0
*/
public class ArrayDemo{
    public static void main(String [] args){
		// (1) 定义一个数组
		int [] arr;
		// (2) 初始化大小
		arr = new int[3];
		// (3)动态初始化赋值 索引没有3 最大为 size -1
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		// (4) for循环遍历数组
		System.out.println("定义赋值输出arr=");
		for(int i=0;i<arr.length;i++){
			System.out.println("arr="+arr[i]);
		}
		
		// (1) 定义一个数组
		// (2) 初始化大小
		int [] arrb = new int[3]; // 合并赋值 动态赋值
		// (3)动态初始化赋值 索引没有3 最大为 size -1
		arrb[0]=1;
		arrb[1]=2;
		arrb[2]=3;
		// (4) for循环遍历数组
		System.out.println("定义赋值输出arrb=");
		for(int i=0;i<arrb.length;i++){
			System.out.println("arrb="+arrb[i]);
		}
		
				// (1) 定义一个数组
		// (2) 初始化大小
		int [] arrc = new int[]{1,2,3}; // 静态赋值
		// (3)动态初始化赋值 索引没有3 最大为 size -1
		// (4) for循环遍历数组
		System.out.println("定义赋值输出arrc=");
		for(int i=0;i<arrb.length;i++){
			System.out.println("arrc="+arrc[i]);
		}
			
		
 		
	
    }
}
