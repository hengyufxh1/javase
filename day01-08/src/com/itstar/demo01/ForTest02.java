package com.itstar.demo01;

/**
* 嵌套for循环
* @author dxw
* @version 1.0
*/

import java.util.Scanner;
public class ForTest02{
    public static void main(String [] args){
		for(int floor=1;floor<=10;floor++){
			for(int home=1;home<=10;home++){
				System.out.println("第"+floor+"层 第"+home+"户");
			}
		}
    }
}
