package com.itstar.demo01;

import com.itstar.demo02.Person;

/**
 * 演示 买汽水
 * @author smart-dxw
 *
 */
public class PerBuyDrink {

	public static void main(String[] args) {
		
		// 1新建一个人类对象来买汽水
		Person p = new Person();
		
		// 2新建一个汽水对象
		Drinks drink = new Drinks();
		
		// 3 初始化人类对象和汽水对象
		
		p.name=("张三");
		drink.brand="可乐";
		drink.setPrice(2.5);
		// 4模仿买汽水
		p.buy(drink);
	}
}
