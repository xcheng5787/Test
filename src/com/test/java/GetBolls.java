package com.test.java;

public class GetBolls {
	//ҡ˫ɫ��  6��1-33�ĺ���  1��1-16����
	public static int[] getboll() {
		//int num = (int) (Math.random()*32+1);
		int[] result = new int[6];
		
		for (int i = 0; i < result.length; i++) {
			while (true) {
				boolean flag = true;
				int num = (int) (Math.random()*33+1);
				for (int j = 0; j < result.length; j++) {
					if (num == result[j]) {
						flag = false;
						break;
					}
				}
				if (flag) {
					result[i] = num;
					break;
				}
			}
		}				
		return result;
	}
}
