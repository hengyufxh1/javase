package com.itstar.demo01;

/**
* for循环
* @author dxw
* @version 1.0
*/

import java.util.Scanner;
public class ForTest{
    public static void main(String [] args){
		System.out.println("\n初始化值为0");
		for(int i=0;i<10;i++){
			System.out.print(",i="+i);
		}
		
		// 注意循环变量的初始化值
		System.out.println("\n初始化值为1");
		for(int i=1;i<10;i++){
			System.out.print(",i="+i);
		}
		
		//(3) 提醒大家一定要小心不要写成 i=i++
		int j =0;
		for(int i = 0; i<10;i++){
			j++;
			j=j++;
			System.out.println("j="+j);
		}
    }
}
