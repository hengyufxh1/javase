package com.itstar.demo01;
/**
 * 演示Math类的基本使用
 * @author smart-dxw
 *
 */

public class MathExample {

	public static void main(String[] args) {
		double a = 0.5;
		
		System.out.println("求绝对值="+Math.abs(-a));

		System.out.println("求反正弦值="+Math.asin(0.5));
		
		System.out.println("求反余弦值="+Math.acos(0.5));
		
		System.out.println("向上取整="+Math.ceil(a));
		
		System.out.println("向下取整="+Math.floor(a));
		
		System.out.println("四舍五入="+Math.round(a));
		
		System.out.println("随机数="+Math.random()*a);
		

	}
}
