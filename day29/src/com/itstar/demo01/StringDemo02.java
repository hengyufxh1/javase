package com.itstar.demo01;

/**
 * 查找父字符串中某一个字符串出现的次数
 * @author smart-dxw
 *
 */
public class StringDemo02 {

	public static void main(String[] args) {
		
		String parent ="aitstaritstaritstarsjditstarhkajhitsitstartstaraitstarrdkjsdfitstartstarsditstarkjk*itstar**kaiitstaritstartstarsbbb***1itstar23";
		String child="itstar";
		int count = getChildStringCount(parent, child);
		System.out.println("itstar 在父串中出现的次数为="+count);
	}
	
	public static int getChildStringCount(String parent,String child){
		// 用来记录子字符串出现的次数
		int count = 0;
		
		// 第一次 子字符串出现的索引
		int index=0;
		
		//  优化前
//		while(true){
//			index= parent.indexOf(child);
//			// 如果k的值不存在，则返回-1
//			if(index!=-1){
//				// 代表我们找到了 子字符串进行加1
//				count++;
//			}else{
//				// 当返回-1时循环中止
//				break;
//			}
//			// 更新我们的 父字符串 从 index+子串长度的位置开始截取
//			parent = parent.substring(index+child.length());
//		}
		
		// 优化后
		while((index=parent.indexOf(child))!= -1){
			count++;
			parent = parent.substring(index+child.length());
		}
		return count;
	}
}
