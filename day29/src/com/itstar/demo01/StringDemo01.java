package com.itstar.demo01;

/**
 * ͳ�ƴ�д��ĸ Сд��ĸ ���� ���ֵĴ���
 * @author smart-dxw
 *
 */
public class StringDemo01 {

	public static void main(String[] args) {
		String s ="`1234567890-=~!@#$%^&*()_+aqwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM,./;'[]{}|:<>?";
		getCount(s);
	}
	
	public static void getCount(String s){
		int upper=0;
		int lower=0;
		int digit=0;
		
		// for ѭ������ -- ���ַ����е�ÿһ���ַ����бȶ�
		for (int i = 0; i < s.length(); i++) {
			// ����һ��char �����洢����ÿ���ַ����е��ַ�
			char c = s.charAt(i);
			// ͨ��ASCII ���ж� ���� 48��д��ĸ65 Сд��ĸ97
			
			if(c>='0' && c<='9'){
				digit++;
			}else if(c>='A'&& c<='Z'){
				upper++;
			}else if(c>='a'&& c<='z'){
				lower++;
			}
		}
		
		System.out.println("���ֵĸ���Ϊ="+digit);
		System.out.println("��д��ĸ�ĸ���Ϊ="+upper);
		System.out.println("Сд��ĸ�ĸ���Ϊ="+lower);
		System.out.println("�ַ��ܳ���="+(s.length()));
	}
}
