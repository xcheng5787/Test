package com.xcheng.interview;

public class Demo6 {
//	A:++,--�����������
//		�Լӣ�++���Լ���--������
//		++:�Լӡ���ԭ�е����ݽ���+1
//		--:�Լ�����ԭ�е����ݽ���-1
//	B:������ʾ
//		a:����ʹ�ã�
//			���ڲ�������ǰ��ͺ���Ч��һ����(�����÷������ǱȽϳ�����)
//		b:��������ʹ�ã�
//			���ڲ�������ǰ�棬�����������Լ���Ȼ���ٲ������㡣
//			���ڲ������ĺ��棬�Ȳ������㣬�����������Լ���
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		int c = 10;
		a = b++;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("=============");
		c = --a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("=============");
		b = ++a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("=============");
		a = c--;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
