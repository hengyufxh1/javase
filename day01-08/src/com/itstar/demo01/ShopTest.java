package com.itstar.demo01;

/**
* ShopTest
* @author dxw
* @version 1.0
*/
import java.util.Scanner;
public class ShopTest{
    public static void main(String [] args){
		welcome();
    }
	
	// 欢迎页面
	public static void welcome(){
		System.out.println("=======================");
		System.out.println("你好欢迎光临java商店");
		System.out.println("按回车键继续操作");
		Scanner scan = new Scanner(System.in);
		scan.next();
		System.out.println("=======================");
		System.out.println("1号：面包5元\n2号：牛奶3元\n3号：汽水2元");
		System.out.println("=======================");
		getSwitchFunc(0);
		
	}
	
	
	// return 结束函数运行
	public static void getSwitchFunc(int i){
		int num;
		if(i!=0){
			System.out.println("我在给你一次机会");
		}
		System.out.println("请输入编号选择正确物品");

		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		switch(num){
			case 1:
				System.out.println("1号：面包5元");
				i=0;
				getMoney(i, 5);
				break;
			case 2:
				System.out.println("2号：牛奶3元");
				i=0;
				getMoney(i, 3);
				break;
			case 3:
				System.out.println("3号：汽水2元");
				i=0;
				getMoney(i,2);
				break;
			default:
				i++;
				if(i>=3){
					welcome();
				}else{
					System.out.println("请不要开玩笑，没有此商品！");
					getSwitchFunc(i);
				}
				break;
		}
	}
	
	public static void getMoney(int i,int mo){
		System.out.println("请支付对应金额，"+mo+"元取走你的物品。");
		double money;
		if(i!=0){
			System.out.println("我在给你一次机会");
		}
		Scanner scan = new Scanner(System.in);
		money = scan.nextDouble();
		System.out.println("你支付了:"+money+"元!");
		if(money>mo){
			double res = money - mo;
			System.out.println("找您的现金为："+res);
			System.out.println("请取走你你的物品！");
			System.out.println("谢谢惠顾");
			welcome();
		}else if(money==mo){
			System.out.println("请取走你你的物品！");
			System.out.println("谢谢惠顾");
			welcome();
		}else if(money<mo){
			i++;
			if(i>=3){
				welcome();
			}else{
				System.out.println("金额不足呢！！");
				getMoney(i, mo);
			}
		}else{
			System.out.println("彩蛋");
		}
	}
}