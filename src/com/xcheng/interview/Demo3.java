package com.xcheng.interview;

//String 类
public class Demo3 {
	// String类的概述
	// a:字符串字面值"abc"也可以看成是一个字符串对象。
	// b:字符串是常量，一旦被赋值，就不能被改变。
	// public String():空构造
	// public String(byte[] bytes):把字节数组转成字符串
	// public String(byte[] bytes,int index,int length):把字节数组的一部分转成字符串
	// public String(char[] value):把字符数组转成字符串
	// public String(char[] value,int index,int count):把字符数组的一部分转成字符串
	// public String(String original):把字符串常量值转成字符串
	public static void main(String[] args) {
		byte[] arr1 = { 97, 98, 99, 100 };// 将字节数组转化成字符串
		String a = new String(arr1);// 解码将计算机读的懂的转换成我们读
		System.out.println(a);

		byte[] arr2 = { 56, 97, 98, 99, 100, 101, 12 };// 把字节数组的一部分转化成字符串
		String b = new String(arr2, 1, 4);// 将arr2字节数组从2索引开始转换4个
		System.out.println(b);

		char[] arr3 = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
		String c = new String(arr3);
		System.out.println(c);

		String d = new String(arr3, 2, 4); // 把字节数组一部分转化成字符串
		System.out.println(d); // 将arr3字节数组从2索引开始转换
	}
}
