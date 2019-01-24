package com.itstar.demo01;

/**
* Continue
* @author dxw
* @version 1.0
*/

public class ContinueTest{
    public static void main(String [] args){
		// 1 continue 在单层循环体的使用 输出偶数
		for(int i=1;i<=10;i++){
			if(i%2==0){
				System.out.println("偶数："+i);
			}else{
				// 继续执行
				continue;
				
			}
		}
		
		// 2 continue 在嵌套循环里面 输出奇数
		int a = 0;
		for(int i=1;i<=10;i++){
			for(int j=1;j<5;j++){
				if(j%2==0){
					continue;
				}
				System.out.println("奇数："+j);
				a++;
			}
		}
		System.out.println("a="+a);
    }
}