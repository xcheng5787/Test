package com.xcheng.interview;

public class Demo1 {
	// Ҫ��ʹ����֪�ı������ڿ���̨���30��20��10��
	// class Outer {
	// public int num = 10;
	// class Inner {
	// public int num = 20;
	// public void show() {
	// int num = 30;
	// System.out.println(?);
	// System.out.println(??);
	// System.out.println(???);
	// }
	// }
	// }
	// class InnerClassTest {
	// public static void main(String[] args) {
	// Outer.Inner oi = new Outer().new Inner();
	// oi.show();
	// }
	// }
	public static void main(String[] args) {
		Outer.Inner oi = new Outer().new Inner();
		oi.show();

	}
}

class Outer {
	public int num = 10;

	class Inner {
		public int num = 20;

		public void show() {
			int num = 30;
			System.out.println(num);
			System.out.println(this.num);
			System.out.println(Outer.this.num);
		}
	}

}
