package com.itstar.demo01;

/**
位运算符 需要转换2进制 目前都是十进制数，运算的时候回自动进行计算
*/
public class BitOperator{
	public static void main(String [] args){
		int a = 5;
		int b = 1;
		// 位与运算
		System.out.println("1&5="+(a&b));
		
		// 位或运算
		System.out.println("1|5="+(a|b));
		
		// 位异或运算
		System.out.println("1^5="+(a^b));
		
		a = 21;
		// 右移运算
		System.out.println("21^1="+(a>>b));
		
		// 左移运算
		System.out.println("21^1="+(a<<b));
		
		a = -10;
		// 无符号右移
		System.out.println("右移运算="+(a>>1));
		System.out.println("无符号右移运算"+(a>>>1));
		
	}
}