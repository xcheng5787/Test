package com.xcheng.calendar;

import java.util.Scanner;

public class calendar {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������");
		int year = sc.nextInt();
		while (true) {
			if (year >= 1990) {
				break;
			}else {
				System.out.println("���������1990�����");
				year = sc.nextInt();			
			}
		}
		System.out.println("������һ���·�");
		int month = sc.nextInt();
		while (true) {
			if (month<=12 && month>=0) {
				break;
			}else {
				System.out.println("������0-12���·�");
				month = sc.nextInt();
			}
		}
		//�ж��Ƿ�������
		boolean Renyear = isRenyear(year);
		if (Renyear) {
			System.out.println(year+"��������");
		}else {
			System.out.println(year+"�겻������");
		}
		
		//�ж��·�����
		int days = daysInMonth(month,Renyear);
		System.out.println(month+"����"+days+"��");
		
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
		
		System.out.println("������\t����һ\t���ڶ�\t������\t������\t������\t������");
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
	
	

	/*�ж�һ���Ƿ�������*/
	private static boolean isRenyear(int Ruenyear) {
		// TODO �ж��Ƿ������� �����ܱ�4�������ܱ�100���� ���߱�400����
		if(Ruenyear%4==0 && Ruenyear%100 != 0 || Ruenyear%400 == 0) {
			return true;
		}else {
			return false;
		}
	}
	/*�ж�һ�����ж�����*/
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
