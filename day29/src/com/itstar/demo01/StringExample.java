package com.itstar.demo01;

public class StringExample {
	public static void main(String[] args) {


		char data[]={'a','b','c','d','e','f'};
		
		
		String str = new String (data);
		
		
		str += "123";
//		char charAt(int index) 返回char指定索引处的值
//		boolean contains(CharSequence s)当且仅当此字符串包含指定的char值序列时才返回true。
//		boolean equals(Object anObject)将此字符串与指定对象进行比较
//		indexOf(String str)返回指定子字符串第一次出现的字符串内的索引。
//		length()返回此字符串的长度。--循环的中止条件
//		boolean matches(String regex) 告诉这个字符串是否匹配给定的 regular expression。
//		String replace(char oldChar,char new Char)返回从替换所有出现的导致一个字符串oldCHar在次字符串 newChar。
//		String[] split(String regex)将此字符串分割为给定的 regular expression的匹配。
//		String substring(int beginIndex, int endIndex)返回一个字符串，该字符串是此字符串的子字符串。
//		String toLowerCase()将所有在此字符，String使用默认语言环境的规则小写。
//		String toUpperCase()将所有在此字符，String使用默认语言环境的规则大写。
//		String trim()返回一个字符串，其值为次字符串，并删除任何前导和尾随空格。
//		/**类型转换 将基本数据类型转换为 字符串*/
//		static String valueOf(boolean b)返回 boolean参数的字符串 boolean形式。
//		static String valueOf(char c)返回 char 参数的字符串 char 形式。
//		static String valueOf(char data)返回 char 参数的字符串 char 形式。
//		static String valueOf(doubleb)返回 double参数的字符串 double形式。
//		static String valueOf(float f)返回 float 参数的字符串 float 形式。
//		static String valueOf(int i)返回 int 参数的字符串 int 形式。
//		static String valueOf(long l)返回 long 参数的字符串 long 形式。
//		static String valueOf(Object obj)返回 Object参数的字符串 Object形式。
		
		
		
		System.out.println(str);
		System.out.println(str.charAt(0));
		
		System.out.println("str是否含有123="+str.contains("123"));
		if("abcdef123".equals(str)){
			System.out.println("有呢");
		}
		System.out.println("str.indexOf="+str.indexOf("123"));
		System.out.println("str.length()="+str.length());
		
		System.out.print("循环charAt(i)输出=");
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		
		// str 调用函数后需要将返回值 重新付给str
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
		
		// 用于冲字符串的开始和结尾修建空格
		System.out.println("str.trim()=["+str.trim()+"]");
		
		
		
		
		
		
		
		
	}
}
