package com.itstar.demo03;
/**
 * person��������ʾ��������д
 * @author DXW
 *
 */
public class Person extends Animal {
	/*����*/
	private String name;
	/*�Ա�*/
	private char sex;
	/*����*/
	private int age;
	
	public double money = 10000.0;

	// ���������Ĺ��캯��
	public Person(String name, int age, char sex){
		// ���캯���� ���ԶԳ�ʼ�������ݽ�����֤
		// _�»��߿��ԶԳ�Ա������������
		this.name = name;
		this.sex = sex;
		this.age = age;
		// System.out.println("3��3�������Ĺ��캯����name="+name+"��sex="+sex+"��age="+age);
	}
	// show
	public void show(){
		System.out.println("��Һã�����"+name+"���귽"+age);
	}
	/*
	 * �Զ�getters setters
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
