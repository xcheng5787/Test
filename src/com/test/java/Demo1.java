package com.test.java;

import java.util.Scanner;

public class Demo1 {
	//摇双色球  6个1-33的红球  1个1-16蓝球
	public static void main(String[] args) {
		/*System.out.println("按回车开始出双色球");
		Scanner sc = new Scanner(System.in);
		sc.next();
		*/
		int[] nums = GetBolls.getboll();
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}		
	}		
}
