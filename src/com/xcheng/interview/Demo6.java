package com.xcheng.interview;

public class Demo6 {
//	A:++,--运算符的作用
//		自加（++）自减（--）运算
//		++:自加。对原有的数据进行+1
//		--:自减。对原有的数据进行-1
//	B:案例演示
//		a:单独使用：
//			放在操作数的前面和后面效果一样。(这种用法是我们比较常见的)
//		b:参与运算使用：
//			放在操作数的前面，先自增或者自减，然后再参与运算。
//			放在操作数的后面，先参与运算，再自增或者自减。
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
