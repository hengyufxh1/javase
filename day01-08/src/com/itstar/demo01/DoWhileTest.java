package com.itstar.demo01;

/**
* DoWhile
* @author dxw
* @version 1.0
*/

import java.util.Scanner;
public class DoWhileTest{
    public static void main(String [] args){
		// 输出1-10的数
		int i = 100; // 循环变量初始化就是100
		// while 循环 先判断后执行
		System.out.println("while 循环 先判断 后执行");
		while(i<=10){
			// 注意要在循环体内 对循环变量进行变更
			// 注意此处不需要 用 i= i++;
			System.out.println("i="+i++);
		}
		
		// do while 循环 限执行 后判断
		System.out.println("do while 循环 限执行 后判断");
		do{
			System.out.println("i="+i);
			i++;
		}while(i<=10);
    }
}
