package com.xcheng.interview;

public class Demo4 {
	// 看下面的程序是否有问题，如果有问题，请指出并说明理由。
	public static void main(String[] args) {
//		byte b1 = 3;
//		byte b2 = 4;
//		byte b3 = b1 + b2;

		// b1+b2报错 正确方法是下面的
		byte b1 = 3;
		byte b2 = 4;
		byte b3 = (byte) (b1 + b2);
		int b4 = b1 + b2;
//		从两方面去回答这个题
//		b1和b2是两个变量,变量里面存储的值都是变化的,所以在程序运行中JVM是无法判断里面具体的值
//		byte类型的变量在进行运算的时候,会自动类型提升为int类型
		byte b5 = 3 + 4;
//		3和4都是常量,java有常量优化机制,就是在编译的的时候直接把3和4的结果赋值给b4了
	}
}
