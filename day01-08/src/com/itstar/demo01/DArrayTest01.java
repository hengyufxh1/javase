package com.itstar.demo01;

/**
* 二维数组
* @author dxw
* @version 1.0
*/
public class DArrayTest01{
    public static void main(String [] args){
		// 1 定义一个二维数组
		
		int [][] d_arr = new int[3][2];
		// 2 动态初始化
		/*
		1 2
		3 4
		5 6
		*/
		// java 数组索引 从0开始
		/*
		d_arr[0][0] = 1;
		d_arr[0][1] = 2;
		d_arr[1][0] = 3;
		d_arr[1][1] = 4;
		d_arr[2][0] = 5;
		d_arr[2][1] = 6;
*/

		int [][] d_arr2 = {{2,3},{3,4},{5,6},{7,8}};
		// 动态初始化 通过for循环实现
		//
		/**/	
		for(int i=0;i<d_arr.length;i++){
			for(int j=0;j<d_arr[i].length;j++){
				d_arr[i][j] = i*2+(j+1);
			}
		}
		
		// 3 通过for循环输出
		System.out.print("[");
		for(int i=0;i<d_arr2.length;i++){
			for(int j=0;j<d_arr2[i].length;j++){
				// 判断是否是最后一个元素 如果则+] 原理 就是判断i等于最大 并且 j等于最大
 				if(i==d_arr2.length-1&&j==d_arr2[i].length-1){
					System.out.print(d_arr2[i][j]+"]");
				}else{// 如果不是 则正常显示
					System.out.print(d_arr2[i][j]+"	");
				}
			}
			// 当一行的数据输出完成之后在换行
			System.out.println();
		}
    }
}
