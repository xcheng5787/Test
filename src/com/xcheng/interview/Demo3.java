package com.xcheng.interview;

//String ��
public class Demo3 {
	// String��ĸ���
	// a:�ַ�������ֵ"abc"Ҳ���Կ�����һ���ַ�������
	// b:�ַ����ǳ�����һ������ֵ���Ͳ��ܱ��ı䡣
	// public String():�չ���
	// public String(byte[] bytes):���ֽ�����ת���ַ���
	// public String(byte[] bytes,int index,int length):���ֽ������һ����ת���ַ���
	// public String(char[] value):���ַ�����ת���ַ���
	// public String(char[] value,int index,int count):���ַ������һ����ת���ַ���
	// public String(String original):���ַ�������ֵת���ַ���
	public static void main(String[] args) {
		byte[] arr1 = { 97, 98, 99, 100 };// ���ֽ�����ת�����ַ���
		String a = new String(arr1);// ���뽫��������Ķ���ת�������Ƕ�
		System.out.println(a);

		byte[] arr2 = { 56, 97, 98, 99, 100, 101, 12 };// ���ֽ������һ����ת�����ַ���
		String b = new String(arr2, 1, 4);// ��arr2�ֽ������2������ʼת��4��
		System.out.println(b);

		char[] arr3 = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
		String c = new String(arr3);
		System.out.println(c);

		String d = new String(arr3, 2, 4); // ���ֽ�����һ����ת�����ַ���
		System.out.println(d); // ��arr3�ֽ������2������ʼת��
	}
}
