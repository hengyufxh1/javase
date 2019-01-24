package com.itstar.demo03;
/**
 * 作为子类
 * @author DXW
 *
 */
public class Student extends Person {

	// 扩展学生的一些成员变量
	private String stdNum;
	private String classRoom;
	private double grade;
	
	
	// 继承构造函数
	public Student(String name, int sex, char age, String stdNum, String classRoom, double grade) {
		super(name, sex, age);
		// TODO Auto-generated constructor stub
		this.stdNum = stdNum;
		this.classRoom  = classRoom;
		this.grade = grade;
		
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
