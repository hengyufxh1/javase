package com.itstar.edu;

/**
 * phone �Լ��������࣬ ���õ����������ͻ�������ǰ��ѧϰ����
 * 
 * @author smart-dxw 
 * @version1.0
 */
public class Phone {
	// �ֻ������Ļ�������
	String brand; // �ֻ�Ʒ��
	String color; // �ֻ���ɫ
	int price; // �ֻ��ļ۸�
	double size; // �ֻ��Ĵ�С

	// �ֻ��ķ���

	public void openPhone() {
		System.out.println(brand+"�ֻ�����");
	}

	public void listen(){
		System.out.println(brand+ "�ֻ�����");
	}
	
	public void shutPhone() {
		System.out.println(brand+ "�ֻ��ػ�");
	}
}
