package com.itstar.demo02;

public class LocalVariable {
	public static String type;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int i = 0;������������ö�����for����
		
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println("���Ǿֲ�����i="+(i+1));
		}
//		System.out.println(i);
		
		type = "����";
		System.out.println("���ǳ�Ա����type="+ type);
	}
	
	public void setType(String _type){
		type = _type;
	}

}
