package com.itstar.demo01;

public class Animal {

	// ��������� ��Ա���� ��װprivate 
	private String name;
	public char sex;
	// ��static ���εĳ�Ա����
	private static String move="�ᶯ";
	public static double weight = 200.0;
	
	// ���캯�� -- �޲ι��캯��
	public Animal(){
		
	}
	
	// ����һ����̬����
	public static void cry(){
		//��̬�������ܹ�ʹ�÷Ǿ�̬�ı���
//		System.out.println(name+"is crying");
		// ��̬���� ֻ��ʹ�þ�̬����
		// ��̬����ֱ�ӵ���
		System.out.println(move+weight+"is crying");
	}
	
	// ����һ���Ǿ�̬����
	public void bigcry(){
		// �Ǿ�̬�����������ʹ�þ�̬�����ͷѾ�̬����
		// ��̬������б��
		System.out.println(move);
		System.out.println(name);
		System.out.println(weight);
	}
}

