package com.itstar.demo01;

/**
 * 创建一个伪未知类
 * 
 * @author smart-dxw
 *
 */
public class Student {

	// 学生的姓名
	private String name;
	// 学生的年龄
	protected int age;

	// 性别
	char sex;
	// 电话号吗
	public String phoneNum;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected Student(String name, String phoneNum) {
		this.name = name;
		this.phoneNum = phoneNum;
	}

	private Student(String name, int age, char sex, String phoneNum) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		return "太天真了[name=" + name + ", age=" + age + ", sex=" + sex + ", phoneNum=" + phoneNum + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phoneNum == null) ? 0 : phoneNum.hashCode());
		result = prime * result + sex;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phoneNum == null) {
			if (other.phoneNum != null)
				return false;
		} else if (!phoneNum.equals(other.phoneNum))
			return false;
		if (sex != other.sex)
			return false;
		return true;
	}

	public void show() {
		System.out.println("不一样的自我");
	}

	private void show(String name) {
		System.out.println(name + "不一样的自我");
	}

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

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
}
