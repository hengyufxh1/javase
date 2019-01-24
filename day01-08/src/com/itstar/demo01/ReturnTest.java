package com.itstar.demo01;

/**
* Swutch
* @author dxw
* @version 1.0
*/

import java.util.Scanner;
public class ReturnTest{
    public static void main(String [] args){
		
 
		func1();
		
		System.out.println("func2()="+func2());
    }
	// return 结束函数运行
	public static void func1(){
		for(int i=1;i<=4;i++){
			if(i%2==0) {
				System.out.println("i="+i);
				return;
			}
		}
	}
	
	// return 可以直接返回我们指定的数据类型
	public static String func2(){
			
		return "你好大家周末愉快。";
		
	}
}