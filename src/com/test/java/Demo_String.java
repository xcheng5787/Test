package com.test.java;

import java.util.ArrayList;

public class Demo_String {
	public static void main(String[] args) {
		/*
		 * ��һ���ַ����ּ����
		 * ��д��ĸһ��
		 * Сд��ĸһ��
		 * ����һ��
		 * ����(����)һ��
		 *  �ַ�����ÿ���ַ�����char  
		 *  char�ֶ�ӦASCII���е���ֵ
		 *  ���Խ������жϳ���
		 * */
		String str = "sadsa7dS6_$\5D4sa23asS1A@$DSdQ";
		ArrayList<Character> list1 = new ArrayList<>();
		ArrayList<Character> list2 = new ArrayList<>();
		ArrayList<Character> list3 = new ArrayList<>();
		ArrayList<Character> list4 = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)>=65&&str.charAt(i)<=90) {
				list1.add(str.charAt(i));
			}else if (str.charAt(i)>=97&&str.charAt(i)<=122) {
				list2.add(str.charAt(i));
			}else if (str.charAt(i)>=48&&str.charAt(i)<=57) {
				list3.add(str.charAt(i));
			}else {
				list4.add(str.charAt(i));
			}
			
		}
		System.out.println(list1.toString());
		System.out.println(list2.toString());
		System.out.println(list3.toString());
		System.out.println(list4.toString());
	}
}
