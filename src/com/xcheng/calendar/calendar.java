package com.xcheng.calendar;

import java.util.Scanner;

public class calendar {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年");
		int year = sc.nextInt();
		while (true) {
			if (year >= 1990) {
				break;
			}else {
				System.out.println("请输入大于1990的年份");
				year = sc.nextInt();			
			}
		}
		System.out.println("请输入一个月份");
		int month = sc.nextInt();
		while (true) {
			if (month<=12 && month>=0) {
				break;
			}else {
				System.out.println("请输入0-12的月份");
				month = sc.nextInt();
			}
		}
		//判断是否是闰年
		boolean Renyear = isRenyear(year);
		if (Renyear) {
			System.out.println(year+"年是闰年");
		}else {
			System.out.println(year+"年不是闰年");
		}
		
		//判断月份天数
		int days = daysInMonth(month,Renyear);
		System.out.println(month+"月有"+days+"天");
		
		int sum  = 0;
		for (int i = 1990; i < year; i++) {
			if (isRenyear(i)) {
				sum += 366;
			}else {
				sum += 365;
			}
		}
		for (int i = 1; i < month; i++) {
			sum += daysInMonth(i, Renyear);
		}
		
		System.out.println("星期天\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六");
		int blank = sum%7+1;
		int temp = 1;
		for (int i = 0; i < blank; i++) {
			System.out.print("\t");
			temp++;
		}
		if (blank>=7) {
			System.out.println("");
			temp = 1;
		}
		for (int i = 1; i <= days; i++) {
			if (temp%7==0) {
				System.out.print(i+"\n");
				temp=1;
			} else {
				System.out.print(i+"\t");
				temp++;
			}
		}
	}
	
	

	/*判断一年是否是闰年*/
	private static boolean isRenyear(int Ruenyear) {
		// TODO 判断是否是闰年 闰年能被4整除不能被100整除 或者被400整除
		if(Ruenyear%4==0 && Ruenyear%100 != 0 || Ruenyear%400 == 0) {
			return true;
		}else {
			return false;
		}
	}
	/*判断一个月有多少天*/
	private static int daysInMonth(int month,boolean isRenyear) {
		switch (month) {
		case 1:
			
		case 3:
			
		case 5:
			
		case 7:
			
		case 8:
			
		case 10:
			
		case 12:
			return 31;
		case 4:
			
		case 6:
			
		case 9:
			
		case 11:
			return 30;
			
		default:
			if (isRenyear) {
				return 29;
			}else {
				return 28;
			}	
		}
	}
	
}
