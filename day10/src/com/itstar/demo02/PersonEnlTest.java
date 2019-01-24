package com.itstar.demo02;
/**
 * 封装
 * @author smart-dxw
 *
 */
public class PersonEnlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		// 因为person类的属性改变成为private私有了 这无法直接通过对象调用
		/*
			p.sex='M';
			p.sex='A';
			p.sex='男';
			p.sex='女';
			p.sex='呵';
		*/
		p.setSex('M');
		p.setSex('男');
		System.out.println(p.getSex());
		// 只能通过方法调用
		
	}

}
