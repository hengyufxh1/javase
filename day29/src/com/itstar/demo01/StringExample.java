package com.itstar.demo01;

public class StringExample {
	public static void main(String[] args) {


		char data[]={'a','b','c','d','e','f'};
		
		
		String str = new String (data);
		
		
		str += "123";
//		char charAt(int index) ����charָ����������ֵ
//		boolean contains(CharSequence s)���ҽ������ַ�������ָ����charֵ����ʱ�ŷ���true��
//		boolean equals(Object anObject)�����ַ�����ָ��������бȽ�
//		indexOf(String str)����ָ�����ַ�����һ�γ��ֵ��ַ����ڵ�������
//		length()���ش��ַ����ĳ��ȡ�--ѭ������ֹ����
//		boolean matches(String regex) ��������ַ����Ƿ�ƥ������� regular expression��
//		String replace(char oldChar,char new Char)���ش��滻���г��ֵĵ���һ���ַ���oldCHar�ڴ��ַ��� newChar��
//		String[] split(String regex)�����ַ����ָ�Ϊ������ regular expression��ƥ�䡣
//		String substring(int beginIndex, int endIndex)����һ���ַ��������ַ����Ǵ��ַ��������ַ�����
//		String toLowerCase()�������ڴ��ַ���Stringʹ��Ĭ�����Ի����Ĺ���Сд��
//		String toUpperCase()�������ڴ��ַ���Stringʹ��Ĭ�����Ի����Ĺ����д��
//		String trim()����һ���ַ�������ֵΪ���ַ�������ɾ���κ�ǰ����β��ո�
//		/**����ת�� ��������������ת��Ϊ �ַ���*/
//		static String valueOf(boolean b)���� boolean�������ַ��� boolean��ʽ��
//		static String valueOf(char c)���� char �������ַ��� char ��ʽ��
//		static String valueOf(char data)���� char �������ַ��� char ��ʽ��
//		static String valueOf(doubleb)���� double�������ַ��� double��ʽ��
//		static String valueOf(float f)���� float �������ַ��� float ��ʽ��
//		static String valueOf(int i)���� int �������ַ��� int ��ʽ��
//		static String valueOf(long l)���� long �������ַ��� long ��ʽ��
//		static String valueOf(Object obj)���� Object�������ַ��� Object��ʽ��
		
		
		
		System.out.println(str);
		System.out.println(str.charAt(0));
		
		System.out.println("str�Ƿ���123="+str.contains("123"));
		if("abcdef123".equals(str)){
			System.out.println("����");
		}
		System.out.println("str.indexOf="+str.indexOf("123"));
		System.out.println("str.length()="+str.length());
		
		System.out.print("ѭ��charAt(i)���=");
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		
		// str ���ú�������Ҫ������ֵ ���¸���str
		str = str.replace("123", ",789");
		str = str.replace("abc", "123");
		str = str.replace("def", ",456");
		
		System.out.println("str="+str);
		
		String[] strAry = str.split(",");
		System.out.println(strAry[0].toString());
		System.out.println(strAry[1].toString());
		System.out.println(strAry[2].toString());
		str =" a b c d e f ";
		System.out.println("str=["+str+"]");
		
		
		System.out.println("str.substring(0,10)="+str.substring(0,10));
		System.out.println("str.trim().substring(0,10)="+str.trim().substring(0,10));
		
		// ���ڳ��ַ����Ŀ�ʼ�ͽ�β�޽��ո�
		System.out.println("str.trim()=["+str.trim()+"]");
		
		
		
		
		
		
		
		
	}
}
