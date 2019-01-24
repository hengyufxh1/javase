package com.itstar.demo01;

/**
* GPA 成绩对应成绩点的计算--奖学金
* @author dxw
* @version 1.0
*/

import java.util.Scanner;
public class IfElseTest02{
    public static void main(String [] args){
        int grade;
		double gpa;
		Scanner scan = new Scanner(System.in);
		
        System.out.println("请输入你的成绩(整形输入):");
		grade = scan.nextInt();
		if(grade >=90){
			gpa =4.5;
		}else if(grade >=80 && grade <90){
			gpa = 4.0;
		}else if(grade >=70 && grade <80) {
			gpa = 3.5;
		}else if(grade >=60 && grade <70) {
			gpa = 3.0;
		}else{
			gpa = 1.0;
		}
		System.out.println("你的成绩："+grade+"，对应的成绩点为"+gpa);
		
    }
}