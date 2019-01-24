package com.itstar.demo01;

/**
* 数组 - 数组静态初始化 方式2 
* @author dxw
* @version 1.0
*/
public class ArrayTest02{
    public static void main(String [] args){
		// 1 静态赋值 - 方式1
		int [] arr1 = new int[]{1,2,3,4,5,6,7,8};
				for(int i=0;i<arr1.length;i++){
			System.out.println("最小值arr1="+arr1[i]);
		}
		// 2 静态赋值 - 方式2
		int [] arr2 = {1,2,3,4,5};

		for(int i=0;i<arr2.length;i++){
			System.out.println("最小值arr2="+arr2[i]);
		}
		
		// 2 动态赋值
		
		
	}
}
