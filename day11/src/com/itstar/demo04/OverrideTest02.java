package com.itstar.demo04;

/**
 * ����student��дpersoon��ķ���
 * @author DXW
 *
 */
public class OverrideTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String name, int sex, char age, String stdNum, String classRoom, double grade
		// ��ͨ�� super�ؼ��� ���ø���Ĺ��캯��
		Student student = new Student("����",20,'��',"20181216","����",100.0);
		// student �༯��������person������� ���� �Ա� 
		// student ����д��person�ķ���
		student.show();
		// ͨ�� super������ ����͸����Ǯ ���Ѹ����Ǯ���������ࡣ
		System.out.println("��ʱ�����õ�ǮΪ="+student.money);
		// person ��ԭ����show����
		Person person = new Person("�Ŷ�",50,'Ů');
		person.show();
		
		
//		System.out.println("studnet�����˸���person����"+student.money+"��Ԫ��");
//		Teacher teacher = new Teacher("����ʦ",32,'��',"200000",20);
//		
//		teacher.show();
	}

}
