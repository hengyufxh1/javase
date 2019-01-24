package com.itstar.demo01;

/**
 * 统计大写字母 小写字母 数字 出现的次数
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
		
		// for 循环遍历 -- 对字符串中的每一个字符进行比对
		for (int i = 0; i < s.length(); i++) {
			// 定义一个char 用来存储我们每个字符串中的字符
			char c = s.charAt(i);
			// 通过ASCII 来判断 数字 48大写字母65 小写字母97
			
			if(c>='0' && c<='9'){
				digit++;
			}else if(c>='A'&& c<='Z'){
				upper++;
			}else if(c>='a'&& c<='z'){
				lower++;
			}
		}
		
		System.out.println("数字的个数为="+digit);
		System.out.println("大写字母的个数为="+upper);
		System.out.println("小写字母的个数为="+lower);
		System.out.println("字符总长度="+(s.length()));
	}
}
