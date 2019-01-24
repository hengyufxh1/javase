package com.itstar.demo02;
/***
 * 静态构造代码块
 * @author DXW
 *
 */
public class Animal {

	// 动物的属性 成员变量 封装private 
	
	private String name;
	public char sex;
	
	// 用static 修饰的成员变量
	private static String move="会动";
	public static double weight = 200.0;
	public static double height ;
	
	// 静态构造代码块
	static{
		height = 1.0;
		// 局部变量
		int age = 10;
		System.out.println("1.静态构造代码块");
	}
	
	// 构造代码块
	{
		height = 3.0;
		name = "小狗";
		System.out.println("2.构造代码块");
	}
	
	// 构造函数 -- 无参构造函数
	public Animal(){
		System.out.println("3.构造函数");
		// 构造代码块
		{
			height = 3.0;
			name = "小狗";
			System.out.println("4.构造方法里面的构造代码快");
		}
	}
	
	// 定义一个静态方法
	public static void cry(){
		//静态方法不能够使用非静态的变量
//		System.out.println(name+"is crying");
		// 静态方法 只能使用静态变量
		// 静态可以直接调用
		System.out.println(move+weight+"is crying");
	}
	
	// 定义一个非静态方法
	public void bigcry(){
		// 非静态方法可以随便使用静态变量和费静态变量
		// 静态变量是斜体
		System.out.println(move);
		System.out.println(name);
		System.out.println(weight);
	}

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

	public static String getMove() {
		return move;
	}

	public static void setMove(String move) {
		Animal.move = move;
	}

	public static double getWeight() {
		return weight;
	}

	public static void setWeight(double weight) {
		Animal.weight = weight;
	}
}

