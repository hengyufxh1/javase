package com.itstar.demo01;

/**
* 矩阵相乘 A*B A的列数 要等于 B的行数
* @author dxw
* @version 1.0
*/
public class DArrayTest02{
    public static void main(String [] args){
		// 线性代数
		// 1定义2个矩阵 A=[2*2] B=[1*2] 
		int [][] A = {{1,2},{4,8}};
		int [][] B = {{1,2}};
		// 2 定义 一个新的矩阵 大小为 A的行数 B的列数
		int C_row = A.length;
		int C_col = B[0].length;
		int [][] C = new int[C_row][C_col];
		// 3 给矩阵赋值 动态赋值
		for(int i = 0;i<C_row;i++){
			for(int j = 0;j<C_col;j++){
				// C矩阵的i行j列 j列这里 B.length表示B矩阵的行数
				for(int k =0;k<B.length;k++){
					C[i][j]+=A[i][k]*B[k][j];
				}
			}
			
		}
		// 4 for 循环输出运行结果
		
		for(int i=0; i<C_row;i++){
			for(int j =0;j<C_col;j++){
				System.out.print(C[i][j]+"\t");
			}
		}
		System.out.println();
    }
}
