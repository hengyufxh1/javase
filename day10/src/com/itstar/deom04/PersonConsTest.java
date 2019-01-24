package com.itstar.deom04;
// 构造函数调用
public class PersonConsTest {
	
	public static void main(String args []){
		Person p = new Person();
		Person p1 = new Person("张三");
		Person p2 = new Person("张三",'男', 20);
		p.show();
		p1.show();
		p2.show();
	}
}
