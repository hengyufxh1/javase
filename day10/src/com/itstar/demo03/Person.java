package com.itstar.demo03;

import com.itstar.demo01.Drinks;

/**
 * ��ʾ����ˮ --����һ������
 * @author smart-dxw
 *
 */
public class Person {
	// ����
	private String name;
	// �Ա�
	private char sex;
	//����
	private int age;
	/*��Ա����*/
	
	
	// �Զ����� get set����

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
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
