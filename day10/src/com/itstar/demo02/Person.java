package com.itstar.demo02;

import com.itstar.demo01.Drinks;

/**
 * ��ʾ����ˮ --����һ������
 * @author smart-dxw
 *
 */
public class Person {
	// ����
	public String name;
	// �Ա�
	private char sex;
	//����
	int age;
	/*��Ա����*/
	
	public char getSex(){
		return sex;
	}
	public void setSex(char _sex){
		if(_sex=='��'|| _sex=='Ů'){
			sex =_sex;
		}else{
			System.out.println("�Բ�������ʧ�ܣ��Ա�ֻ�����л�Ů��");
		}
	}
	
	/*
	 * �����Ա�ĸ�ֵ���� ʵ�� ��֤
	 * */
	public void eat(){
		System.out.println(name+"�ڳԷ�");
	}
	
	public void drink(){
		System.out.println(name+"�ں�����");
	}
	
	public void buy(Drinks drink){
		System.out.println(name+"����һƿ"+drink.brand+"����"+drink.price+"Ԫ��");
	}
}
