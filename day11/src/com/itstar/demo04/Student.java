package com.itstar.demo04;

public class Student extends Person {

	// ��չѧ����һЩ��Ա����
	private String stdNum;
	private String classRoom;
	private double grade;
	public double money = 1000.0;
	
	// �̳й��캯��
	public Student(String name, int sex, char age, String stdNum, String classRoom, double grade) {
		// super��ʾ ���ø���Ĺ��췽��
		super(name, sex, age);
		// TODO Auto-generated constructor stub
		// this money��ʾ�����Ǯ
		// super money��ʾ�˸����Ǯ
		this.money += super.money;
		this.stdNum = stdNum;
		this.classRoom  = classRoom;
		this.grade = grade;
		
	}
	// show
	public void show(){
		System.out.println("�����show����");
		System.out.println("��Һã�����"+super.getName()+"���귽"+super.getAge()+"�Ͷ���"+classRoom);
	}

	public String getStdNum() {
		return stdNum;
	}


	public void setStdNum(String stdNum) {
		this.stdNum = stdNum;
	}


	public String getClassRoom() {
		return classRoom;
	}


	public void setClassRoom(String classRoom) {
		this.classRoom = classRoom;
	}


	public double getGrade() {
		return grade;
	}


	public void setGrade(double grade) {
		this.grade = grade;
	}
}
