package com.test.java;

import java.util.ArrayList;

public class Demo_String {
	public static void main(String[] args) {
		/*
		 * 将一个字符串分拣出来
		 * 大写字母一类
		 * 小写字母一类
		 * 数字一类
		 * 其他(符号)一类
		 *  字符串中每个字符都是char  
		 *  char又对应ASCII表中的数值
		 *  可以将区间判断出来
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
