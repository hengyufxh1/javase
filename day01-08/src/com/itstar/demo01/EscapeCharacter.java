package com.itstar.demo01;

/**
转义运算符
*/
public class EscapeCharacter{
	public static void main(String [] args){
		char c = '\7';
		// 大写字母 A 对应的 ascII 65 转成 8 进制
		
		char c2= '\101';
		System.out.println("c2="+c2+" ,c="+c);
		
		// 16进制 Unicode 转义字符 范围更广
		// 对应的十进制33
		
		char c3= '\u0021';
		System.out.println("c3="+c3);
		
		String s = " \\*我爱\"Young\"老师，It's nice.*\\";
		System.out.println("s="+s);
		
		String s1 = "你好，\r hello，world。";
		System.out.println("s1="+s1);
		
		String s2 = "你好，\n hello，world。";
		System.out.println("s2="+s2);
		
		String s3 = "你好，\t hello，world。";
		System.out.println("s3="+s3);
		
		String s4 = "你好，\b hello，world。";
		System.out.println("s4="+s4);
		
		
	}
}