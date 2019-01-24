package com.itstar.demo01;

/**
* 数组
* 找出数组里的最大值和最小值
* @author dxw
* @version 1.0
*/
public class ArrayDemo02{
    public static void main(String [] args){
		
		int [] arr = new int[]{11,23,31,35,42,21,35,67,89,60,57,38,26,12,44,56,65,62,71,88,97}; // 静态赋值
		// 定一个整型值来存储最大值
		int max = arr[0];
		
		System.out.println("最大值arr=");
		// for循环遍历
		for(int i=0;i<arr.length;i++){;
			if(max<arr[i]){
				// 如果我们认为的最大值 小于arr[i] 需要将当前最大的值付给max
				max = arr[i];
			}
		}
		System.out.println(max);
		
		
		int min = arr[0];
		
		System.out.println("最小值arr=");
		// for循环遍历
		for(int i=0;i<arr.length;i++){
			if(min>arr[i]){
				// 如果我们认为的最大值 小于arr[i] 需要将当前最大的值付给max
				min = arr[i];
			}
		}
		System.out.println(min);
	}
}
