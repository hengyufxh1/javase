package com.itstar.demo02;
/**
 * ��װ
 * @author smart-dxw
 *
 */
public class PersonEnlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		// ��Ϊperson������Ըı��Ϊprivate˽���� ���޷�ֱ��ͨ���������
		/*
			p.sex='M';
			p.sex='A';
			p.sex='��';
			p.sex='Ů';
			p.sex='��';
		*/
		p.setSex('M');
		p.setSex('��');
		System.out.println(p.getSex());
		// ֻ��ͨ����������
		
	}

}
