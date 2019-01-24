package com.itstar.demo01;

/**
* 主要演示基本数据类型的加减乘除
* @author dxw
* @version 1.0
*/

public class OperatiorTest01{
    public static void main(String [] args){
        // 定义变量
        int a = 1;
        int b = 2;
        int sum;
        int sub;
        int mul;
        double dvd;
        int mod;
        // 算数运算符 基本运算

        // 加法
        sum = a+b;
        // 减法
        sub=a-b;
        // 乘法
        mul=a*b;
        // 除法
        // 先计算 a/b 这是证书的除法 1/2=0
        // 然后 再把结果 赋给了 dvd 0.0
        dvd =a/b;
        // 先计算时，需要先把 int 转换为 double1.0/2.0 dvd2=0.5
        double dvd2 = a/(b*1.0);

        System.out.println("加法,a+b="+sum);
        System.out.println("减法,a-b="+sub);
        System.out.println("乘法,a*b="+mul);
        System.out.println("除法,a/b="+dvd);
        System.out.println("除法,a/(b*1.0)="+dvd2);
    }
}