package com.itstar.demo01;

/**
* Break 中止语句
* @author dxw
* @version 1.0
*/

import java.util.Scanner;
public class BreakTest{
    public static void main(String [] args){
		int z = 1;
		System.out.println("break中止语句1");
		while(z<=10){
			// 注意要在循环体内 对循环变量进行变更
			// 注意此处不需要 用 z= z++;
			System.out.println("z="+z++);
			break;
		}
		
		System.out.println("break中止语句2");
		for(int i=1;i<=10;i++){
			if(1%2==0){
				System.out.println("偶数："+i);
			}else{
				// break 直接中止了循环，所以没有任何偶数输出
				break;
			}
		}
		
		// break 在嵌套循环里面的 输出奇数
		
		for(int i=1;i<=10;i++){
			for(int j=1;j<=5;j++){
				
				if(j%2==0){
					// 只中止了当前的循环
					break;
				}
				System.out.println(j);
			}
		}
		
    }
}
