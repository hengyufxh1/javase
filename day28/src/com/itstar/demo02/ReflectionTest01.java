package com.itstar.demo02;

import java.lang.reflect.Method;

import com.itstar.demo01.Student;

public class ReflectionTest01 {

	public static void main(String[] args) {
		
		
		// 方法1 通过getClass方法
		Student student = new Student();
		Class stuClass = student.getClass();
		System.out.println(stuClass.getName());
		
		// 用的比较少 因为我们已经知道这个类的结构了 没必要通过反射获得
		// 方法2 通过class属性
		Class stuClass2=Student.class;
		System.out.println(stuClass2.getName());
		
		// 方法3 通过forName
		try {
			Class stuClass3 = Class.forName("com.itstar.demo01.Student");
			System.out.println(stuClass3);
			Method[] methods = stuClass3.getDeclaredMethods();
			for (Method method : methods) {
				System.out.println(method);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
