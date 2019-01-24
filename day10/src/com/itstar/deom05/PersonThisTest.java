package com.itstar.deom05;

import com.itstar.deom05.Person;

public class PersonThisTest {
	public static void main(String args []){
		Person p1 = new Person("张三",'男', 20);
		// 会通过 this()调用无参构造函数。
		Person p2 = new Person("李四");
		Person p3 = new Person("李倩",'女', 19);
		System.out.println("张三的对象地址对应的是="+p1);
		System.out.println("李四的对象地址对应的是="+p2);
		System.out.println("李倩的对象地址对应的是="+p3);
		p1.show();
		p2.show();
		p3.show();
	}
}
