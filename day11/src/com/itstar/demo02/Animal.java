package com.itstar.demo02;
/***
 * ��̬��������
 * @author DXW
 *
 */
public class Animal {

	// ��������� ��Ա���� ��װprivate 
	
	private String name;
	public char sex;
	
	// ��static ���εĳ�Ա����
	private static String move="�ᶯ";
	public static double weight = 200.0;
	public static double height ;
	
	// ��̬��������
	static{
		height = 1.0;
		// �ֲ�����
		int age = 10;
		System.out.println("1.��̬��������");
	}
	
	// ��������
	{
		height = 3.0;
		name = "С��";
		System.out.println("2.��������");
	}
	
	// ���캯�� -- �޲ι��캯��
	public Animal(){
		System.out.println("3.���캯��");
		// ��������
		{
			height = 3.0;
			name = "С��";
			System.out.println("4.���췽������Ĺ�������");
		}
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

