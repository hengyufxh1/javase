package com.itstar.edu;

import java.util.Random;

public class RandomCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �洢ѧ��������
		String[] StuNames = new String[5];
		// step1 ��̬��ʼ��ѧ������
		addStudent(StuNames);
		
		// step2 ���������
		for (int count = 0; count < 10; count++) {
			String name = randCall(StuNames);
			System.out.println("��"+count+"�ε����ǣ�"+name);
		}
	}
	
	/*
	 * ʵ��ѧ�������ĳ�ʼ��
	 * */
	public static void addStudent(String[] StuNames){
		for (int i = 0; i < StuNames.length; i++) {
			StuNames[i] = "��"+i;
		}
	}
	
	/*
	 * ʵ���������
	 * @return ��������㵽������ String
	 * @param ѧ�����ֳ�ʼ��������
	 * */
	
	public static String randCall(String [] StuNames){
		// ʹ�� random��
		Random rand = new Random();
		
		// ��������� 0-length -1
		int index=rand.nextInt(StuNames.length);
		String name = StuNames[index];
		return name;
	}

}
