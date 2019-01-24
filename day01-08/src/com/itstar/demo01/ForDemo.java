package com.itstar.demo01;

/**
* 99乘法表
* @author dxw
* @version 1.0
*/
public class ForDemo{
    public static void main(String [] args){
		for(int i = 1; i < 10;i++){
			for(int j = 1;j <= i;j++){
				// 计算 \t 制表符
				System.out.print(j +"*"+ i +"="+ (i*j) +"\t" );
			}
			//换行
			System.out.println();
		}
	}
}
		