package com.itstar.edu;

/**
 * phone 自己创建的类， 所用到的数据类型基本都是前面学习过的
 * 
 * @author smart-dxw 
 * @version1.0
 */
public class Phone {
	// 手机常见的基本属性
	String brand; // 手机品牌
	String color; // 手机颜色
	int price; // 手机的价格
	double size; // 手机的大小

	// 手机的方法

	public void openPhone() {
		System.out.println(brand+"手机开机");
	}

	public void listen(){
		System.out.println(brand+ "手机听歌");
	}
	
	public void shutPhone() {
		System.out.println(brand+ "手机关机");
	}
}
