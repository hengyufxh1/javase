package com.itstar.demo01;

/**
* While
* @author dxw
* @version 1.0
*/

import java.util.Scanner;
public class WhileTest{
    public static void main(String [] args){
		int i = 1;
		while(i<=10){
			// 注意要在循环体内 对循环变量进行变更
			// 注意此处不需要 用 i= i++;
			System.out.println("i="+i++);
		}
    }
}
