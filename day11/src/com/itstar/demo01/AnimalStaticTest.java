package com.itstar.demo01;

public class AnimalStaticTest {
	public static void main(String[] args) {
		// ����һ������ û�н���ʵ���� ��ʼ������
		Animal.weight = 100.0;
		// ����Ҫʵ����
		Animal.cry();
		Animal animal = new Animal();
		// weight ʹ�� public static ���ε����Կ���ֱ�ӷ���
		animal.weight = 300.0;
		// ֻ��ʵ�����ſ���ʹ��
		animal.bigcry();
		// ͨ�� ����ֱ�ӷ��� ��sex �޷�ͨ������ֱ�ӷ���
		
		// ��ʼ�� ʵ���� ����
		Animal animal2 = new Animal();
		animal.weight = 400.0;
		
		// sexֻ��ʵ������ſ��Ա�����
		animal2.sex='��';
		Animal animal3 = new Animal();
		animal.weight = 500.0;
		// ��Ϊ static �Ǵ�����ص�ʱ������� animal��weight
		// ��һ��
		System.out.println(animal.weight);
		animal.weight = 500.0;
		System.out.println(animal2.weight);
		System.out.println(animal3.weight);
	}
}
