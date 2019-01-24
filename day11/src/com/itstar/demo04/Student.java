package com.itstar.demo04;

public class Student extends Person {

	// 扩展学生的一些成员变量
	private String stdNum;
	private String classRoom;
	private double grade;
	public double money = 1000.0;
	
	// 继承构造函数
	public Student(String name, int sex, char age, String stdNum, String classRoom, double grade) {
		// super表示 调用父类的构造方法
		super(name, sex, age);
		// TODO Auto-generated constructor stub
		// this money表示子类的钱
		// super money表示了父类的钱
		this.money += super.money;
		this.stdNum = stdNum;
		this.classRoom  = classRoom;
		this.grade = grade;
		
	}
	// show
	public void show(){
		System.out.println("子类的show方法");
		System.out.println("大家好，我是"+super.getName()+"，年方"+super.getAge()+"就读于"+classRoom);
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
