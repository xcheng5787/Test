package com.xcheng.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {
	private Calculator calculator = new Calculator();

	@BeforeClass // 注意,这里必须是static...因为方法将在类被装载的时候就被调用(那时候还没创建实例)
	public static void setUpBeforeClass() throws Exception {
		System.out.println("global");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("global destory");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("一个测试开始..");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("一个测试结束..");
	}

	@Ignore
	@Test
	public void testAdd() {
		int result = calculator.add(1, 2);
		assertEquals(3, result);
	}

	@Test
	public void testSubstract() {
		int result = calculator.substract(5, 2);
		assertEquals(3, result);

	}

	@Test
	public void testMultiply() {
		int result = calculator.multiply(4, 2);
		assertEquals(8, result);
	}

	@Test(expected = Exception.class)
	public void testDivide() throws Exception {
		System.out.println("teddd");
		calculator.divide(4, 0);// 很简单的办法.......
	}

	@Test(timeout = 1000) // 单位为毫秒
	public void testSquareRoot() {
		calculator.squareRoot(4);
	}

}
