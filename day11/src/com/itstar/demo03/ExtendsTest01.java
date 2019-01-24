package com.itstar.demo03;

/**
 * 测试student与person的继承关系
 * @author DXW
 *
 */
public class ExtendsTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("张三",20,'男',"20181216","龙班",100.0);
		// student 类集成了我们person类的姓名 年龄 性别 
		// student 类可以使用父类person的方法
		student.show();
		
		
		System.out.println("studnet集成了父类person父类"+student.money+"万元！");
		Teacher teacher = new Teacher("刘老师",32,'男',"200000",20);
		
		teacher.show();
	}

}
