package com.itstar.demo03;

/**
 * ����student��person�ļ̳й�ϵ
 * @author DXW
 *
 */
public class ExtendsTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("����",20,'��',"20181216","����",100.0);
		// student �༯��������person������� ���� �Ա� 
		// student �����ʹ�ø���person�ķ���
		student.show();
		
		
		System.out.println("studnet�����˸���person����"+student.money+"��Ԫ��");
		Teacher teacher = new Teacher("����ʦ",32,'��',"200000",20);
		
		teacher.show();
	}

}
