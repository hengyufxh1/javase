package com.itstar.demo02;

public class LocalVariable {
	public static String type;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int i = 0;如果想在外面用定义在for外面
		
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println("我是局部变量i="+(i+1));
		}
//		System.out.println(i);
		
		type = "整数";
		System.out.println("我是成员变量type="+ type);
	}
	
	public void setType(String _type){
		type = _type;
	}

}
