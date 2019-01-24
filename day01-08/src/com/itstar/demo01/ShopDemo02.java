package com.itstar.demo01;

/**
* 综合小案例---卖汽水
* @author dxw
* @version 1.0
*/
import java.util.Scanner;
public class ShopDemo02{
    public static void main(String [] args){
		// 1 选购页面
		System.out.println("--------------欢迎大家来到我的小店--------------");
		System.out.println("[1]绿茶");
		System.out.println("[2]雪碧");
		System.out.println("[3]可乐");
		System.out.println("[4]退出");
		// 2  库存初始化 品牌吗 规格 价格 数量
		// 2-1 绿茶基本信息
		String GreenTee ="雪碧";
		int GreenTeeSize = 500;
		double GreenTeePrice=5.0;
		int GreenTeeCount = 10;
		
		// 2-2 雪碧
		String Sprite ="雪碧";
		int SpriteSize = 500;
		double SpritePrice=4.5;
		int SpriteCount = 5;
		
		// 2-2 可乐
		String Cola ="雪碧";
		int ColaSize = 300;
		double ColaPrice=4.5;
		int ColaCount = 5;
		
		// 3 销售
		while(true){
			System.out.println("cls");
			Scanner scan = new Scanner(System.in);
			int Choice = scan.nextInt();
			int count;
			if(Choice !=0){
				switch(Choice){
					case 1:
						System.out.println("-------------------------------------------");
						System.out.println("品牌----规格(ml)----价格----数量");
						System.out.println(GreenTee+"----"+GreenTeeSize+"----------"+GreenTeePrice+"------"+GreenTeeCount);
						System.out.println("-------------------------------------------");
						// 买的数量
						count = scan.nextInt();
						// 
						if(count > GreenTeeCount){
							System.out.println("亲，小店的商品没有这么多库存啦！！！");
						}else if(count <=0){
							System.out.println("亲，请输入正确的选购数量！！！");
						}else{
							System.out.println("亲，请你支付"+(count*GreenTeePrice)+"钱！！！");
							System.out.println("支付成功，欢迎下次光临！！！");
							GreenTeeCount -= count;
						}
						break;
					case 2:
						System.out.println("-------------------------------------------");
						System.out.println("品牌----规格(ml)----价格----数量");
						System.out.println(Sprite+"------"+SpriteSize+"--------"+SpritePrice+"------"+SpriteCount);
						System.out.println("-------------------------------------------");
						// 买的数量
						count = scan.nextInt();
						// 
						if(count > GreenTeeCount){
							System.out.println("亲，小店的商品没有这么多库存啦！！！");
						}else if(count <=0){
							System.out.println("亲，请输入正确的选购数量！！！");
						}else{
							System.out.println("亲，请你支付"+(count*SpritePrice)+"钱！！！");
							System.out.println("支付成功，欢迎下次光临！！！");
							SpriteCount -= count;
						}
						break;
					case 3:
						System.out.println("-------------------------------------------");
						System.out.println("品牌----规格(ml)----价格----数量");
						System.out.println(Cola+"------"+ColaSize+"--------"+ColaPrice+"------"+ColaCount);
						System.out.println("-------------------------------------------");
						// 买的数量
						count = scan.nextInt();
						// 
						if(count > GreenTeeCount){
							System.out.println("亲，小店的商品没有这么多库存啦！！！");
						}else if(count <=0){
							System.out.println("亲，请输入正确的选购数量！！！");
						}else{
							System.out.println("亲，请你支付"+(count*ColaPrice)+"钱！！！");
							System.out.println("支付成功，欢迎下次光临！！！");
							ColaCount -= count;
						}
						break;
					default:
						System.out.println("亲，对不起选择商品不存在！！！");
						break;
					
				}
			} else {
				break;
			}
		}
	}
}
		