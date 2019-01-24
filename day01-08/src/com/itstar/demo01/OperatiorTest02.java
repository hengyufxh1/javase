package com.itstar.demo01;

/**
 * 自增自减运算
 * （1）++a先计算后使用
 * （2）a++先使用后计算
 * （3）++一次 代表增加1
 * @author DXW
 * @version 1.0
 */
 public class OperatiorTest02{
	 
	 public static void main(String [] args){
		int a=1;
		int b=++a*++a;
		System.out.println("此时的a="+a);
		int c=a++*++a;
		System.out.println("此时的a="+a);
		System.out.println("此时的b="+b);
		System.out.println("此时的c="+c);
	 }
 }