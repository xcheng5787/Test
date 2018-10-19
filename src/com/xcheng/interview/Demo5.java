package com.xcheng.interview;

public class Demo5 {
	// 多态（概念）：
	//
	// 所谓多态，就是指一个引用（类型）在不同的情况下的多种状态。也可以理解为，多态是指通过指向父类的指针，来调用在不同子类中实现的方法。。
	//
	// 场景假设：
	//
	// 一个主人养了猫和狗，猫和狗都有自己爱吃的东西，主人在喂它们的时候，如果既要判断是猫还是狗，再判断他们分别爱吃什么，就显得很麻烦。
	// 如果主人养了很多种动物，这样的重复判断，就会浪费很多时间。有什么办法，能让主人拿到一种食物就知道这是哪种动物的，就好了。
	public static void main(String[] args) {
		Master master = new Master();
		master.feed(new Dog(), new Bone());

		// hin方便，可以再试试
		master.feed(new Cat(), new Fish());

		Animal an = new Cat();
		Food f = new Fish();
		master.feed(an, f);

	}

}

// 1.首先，创造动物类：
// 动物类
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
		System.out.println("动物类的cry方法,什么都没有");
	}

	public void eat() {
		System.out.println("动物类的eat方法,什么都没有");
	}
}

//2.其次，分别创造猫类和狗类（他们继承于动物类）：
class Cat extends Animal {
	// 覆盖（重写）方法
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("喵喵");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("我爱吃鱼");
	}
}

class Dog extends Animal {
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("旺旺");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("我爱吃骨头");
	}
}

//3.再者，创建食物类：
class Food {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 食物类里面让它有一个方法
	public void showName() {
		System.out.println();
	}
}
//创建鱼类和骨头类 继承食物类

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

//主人类（就可以将动物和对应的食物统一起来）：
class Master {
	// 给动物喂食物，如果没有多态，他要写给猫喂食和给狗喂食两个方法
	// 有了多态，以后即使再来好多动物，用这一个函数就可以了
	public void feed(Animal an, Food f) {
		an.eat();
		f.showName();
	}
}