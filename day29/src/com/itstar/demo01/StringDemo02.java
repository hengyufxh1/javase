package com.itstar.demo01;

/**
 * ���Ҹ��ַ�����ĳһ���ַ������ֵĴ���
 * @author smart-dxw
 *
 */
public class StringDemo02 {

	public static void main(String[] args) {
		
		String parent ="aitstaritstaritstarsjditstarhkajhitsitstartstaraitstarrdkjsdfitstartstarsditstarkjk*itstar**kaiitstaritstartstarsbbb***1itstar23";
		String child="itstar";
		int count = getChildStringCount(parent, child);
		System.out.println("itstar �ڸ����г��ֵĴ���Ϊ="+count);
	}
	
	public static int getChildStringCount(String parent,String child){
		// ������¼���ַ������ֵĴ���
		int count = 0;
		
		// ��һ�� ���ַ������ֵ�����
		int index=0;
		
		//  �Ż�ǰ
//		while(true){
//			index= parent.indexOf(child);
//			// ���k��ֵ�����ڣ��򷵻�-1
//			if(index!=-1){
//				// ���������ҵ��� ���ַ������м�1
//				count++;
//			}else{
//				// ������-1ʱѭ����ֹ
//				break;
//			}
//			// �������ǵ� ���ַ��� �� index+�Ӵ����ȵ�λ�ÿ�ʼ��ȡ
//			parent = parent.substring(index+child.length());
//		}
		
		// �Ż���
		while((index=parent.indexOf(child))!= -1){
			count++;
			parent = parent.substring(index+child.length());
		}
		return count;
	}
}
