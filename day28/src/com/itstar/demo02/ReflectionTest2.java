package com.itstar.demo02;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.itstar.demo01.Student;

public class ReflectionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// step 1 通过反射获得student运行对象
		try {
			Class stuClass = Class.forName("com.itstar.demo01.Student");
			
			// step 2 建立一个函数获得所有公共的构造函数
			getConstructors(stuClass);
			
			// step 3 建立一个函数 输出所有的构造函数 包含公共私有
			printDeclaredConstructors(stuClass);
			
			// step 4 如何使用指导的构造函数
			// 获得一个使用的正常的构造函数
			// 例如：
			Constructor cstuc = stuClass.getDeclaredConstructor(String.class,int.class,char.class,String.class);
			// 访问私有的构造方法。必须通过Accessible设置true强行访问
			cstuc.setAccessible(true);
			Object obj = cstuc.newInstance("DynamicBoy",20,'男',"123456");
			System.out.println(obj);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 输出某个类的公共构造函数
	 * @param myClass
	 */
	public static void getConstructors(Class myClass) {
		// TODO Auto-generated method stub
		System.out.println("step 2 建立一个函数获得所有公共的构造函数");
		Constructor[] constructors =  myClass.getConstructors();
		for (Constructor constructor : constructors) {
			System.out.println(constructor);
		}
	}
	
	
	/**
	 * 输出某个类的公共构造函数
	 * @param myClass
	 */
	public static void printDeclaredConstructors(Class myClass) {
		// TODO Auto-generated method stub
		System.out.println("step 3 建立一个函数 输出所有的构造函数 包含公共私有");
		Constructor[] constructors =  myClass.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			System.out.println(constructor);
		}
	}
	
	
}
