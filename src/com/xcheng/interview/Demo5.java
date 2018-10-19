package com.xcheng.interview;

public class Demo5 {
	// ��̬�������
	//
	// ��ν��̬������ָһ�����ã����ͣ��ڲ�ͬ������µĶ���״̬��Ҳ�������Ϊ����̬��ָͨ��ָ�����ָ�룬�������ڲ�ͬ������ʵ�ֵķ�������
	//
	// �������裺
	//
	// һ����������è�͹���è�͹������Լ����ԵĶ�����������ι���ǵ�ʱ�������Ҫ�ж���è���ǹ������ж����Ƿֱ𰮳�ʲô�����Եú��鷳��
	// ����������˺ܶ��ֶ���������ظ��жϣ��ͻ��˷Ѻܶ�ʱ�䡣��ʲô�취�����������õ�һ��ʳ���֪���������ֶ���ģ��ͺ��ˡ�
	public static void main(String[] args) {
		Master master = new Master();
		master.feed(new Dog(), new Bone());

		// hin���㣬����������
		master.feed(new Cat(), new Fish());

		Animal an = new Cat();
		Food f = new Fish();
		master.feed(an, f);

	}

}

// 1.���ȣ����춯���ࣺ
// ������
class Animal {
	int age;
	String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void cry() {
		System.out.println("�������cry����,ʲô��û��");
	}

	public void eat() {
		System.out.println("�������eat����,ʲô��û��");
	}
}

//2.��Σ��ֱ���è��͹��ࣨ���Ǽ̳��ڶ����ࣩ��
class Cat extends Animal {
	// ���ǣ���д������
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("����");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("�Ұ�����");
	}
}

class Dog extends Animal {
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("����");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("�Ұ��Թ�ͷ");
	}
}

//3.���ߣ�����ʳ���ࣺ
class Food {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// ʳ��������������һ������
	public void showName() {
		System.out.println();
	}
}
//��������͹�ͷ�� �̳�ʳ����

class Fish extends Food {
	@Override
	public void showName() {
		// TODO Auto-generated method stub
		System.out.println("this is a fish");
	}
}

class Bone extends Food {
	@Override
	public void showName() {
		// TODO Auto-generated method stub
		System.out.println("this is a bone");
	}
}

//�����ࣨ�Ϳ��Խ�����Ͷ�Ӧ��ʳ��ͳһ��������
class Master {
	// ������ιʳ����û�ж�̬����Ҫд��èιʳ�͸���ιʳ��������
	// ���˶�̬���Ժ�ʹ�����öද�����һ�������Ϳ�����
	public void feed(Animal an, Food f) {
		an.eat();
		f.showName();
	}
}