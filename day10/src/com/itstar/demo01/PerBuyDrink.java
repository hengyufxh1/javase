package com.itstar.demo01;

import com.itstar.demo02.Person;

/**
 * ��ʾ ����ˮ
 * @author smart-dxw
 *
 */
public class PerBuyDrink {

	public static void main(String[] args) {
		
		// 1�½�һ���������������ˮ
		Person p = new Person();
		
		// 2�½�һ����ˮ����
		Drinks drink = new Drinks();
		
		// 3 ��ʼ������������ˮ����
		
		p.name=("����");
		drink.brand="����";
		drink.setPrice(2.5);
		// 4ģ������ˮ
		p.buy(drink);
	}
}
