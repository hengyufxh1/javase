package com.itstar.deom05;

public class Person {
	/*����*/
	private String name;
	/*�Ա�*/
	private char sex;
	/*����*/
	private int age;
	

	/* ���幹�캯�� */
	// �޲εĹ��캯��
	public Person(){
		System.out.println("1���޲ι��캯��û�з������ͣ�");
	}
	
	// һ�������Ĺ��캯��
	public Person(String _name){
		// ��ʾ�������޲εĹ��޺���
		this();
		name =_name;
		System.out.println("2��1�������Ĺ��캯����name="+name);
	}
	
	// һ�������Ĺ��캯��
	public Person(String name, char sex, int age){
		// ���캯���� ���ԶԳ�ʼ�������ݽ�����֤
		// _�»��߿��ԶԳ�Ա������������
		this.name = name;
		this.sex = sex;
		this.age = age;
		System.out.println("3��3�������Ĺ��캯����name="+name+"��sex="+sex+"��age="+age);
	}

	// show
	public void show(){
		System.out.println("��Һ�����"+name+"��"+sex+"������"+age+"�꣡");
		// ��show ������������һ��this
		System.out.println(this);
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
