package com.itstar.demo01;

public class SwitchTest{
    public static void main(String [] args){
        int a = 5;
		int b= 6;
		int k;
		
		switch(a>b?0:1){
			case 0:
				k=0;
				break;
			case 1:
				k=1;
				break;
			default:
				k=10000;
				break;
		}
		System.out.println("l="+k);
    }
}