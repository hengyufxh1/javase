package com.itstar.deom04;
// ���캯������
public class PersonConsTest {
	
	public static void main(String args []){
		Person p = new Person();
		Person p1 = new Person("����");
		Person p2 = new Person("����",'��', 20);
		p.show();
		p1.show();
		p2.show();
	}
}
