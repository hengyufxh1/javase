package com.itstar.deom05;

import com.itstar.deom05.Person;

public class PersonThisTest {
	public static void main(String args []){
		Person p1 = new Person("����",'��', 20);
		// ��ͨ�� this()�����޲ι��캯����
		Person p2 = new Person("����");
		Person p3 = new Person("��ٻ",'Ů', 19);
		System.out.println("�����Ķ����ַ��Ӧ����="+p1);
		System.out.println("���ĵĶ����ַ��Ӧ����="+p2);
		System.out.println("��ٻ�Ķ����ַ��Ӧ����="+p3);
		p1.show();
		p2.show();
		p3.show();
	}
}
