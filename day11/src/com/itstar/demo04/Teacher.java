package com.itstar.demo04;

/**
 * tracher �̳���person��
 * @author DXW
 *
 */
public class Teacher extends Person{

	private String tNum;
	private int workyear;
	
	public Teacher(String name, int age, char sex) {
		super(name, age, sex);
		// TODO Auto-generated constructor stub
	}
	
	
	// ���캯������
	public Teacher(String name, int age, char sex, String tNum, int workyear) {
		super(name, age, sex);
		this.tNum = tNum;
		this.workyear = workyear;
	}

	public String getNum() {
		return tNum;
	}

	public void setNum(String tNum) {
		this.tNum = tNum;
	}

	public int getWorkyear() {
		return workyear;
	}

	public void setWorkyear(int workyear) {
		this.workyear = workyear;
	}
}
