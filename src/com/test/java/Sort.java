package com.test.java;

import java.util.Arrays;

public class Sort {
	
	public static void main(String[] args) {
		int[] arr = {24, 69, 80, 57, 13};
		//ð������
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				int temp;
				if (arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		//ѡ������
		/*for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				int temp;
				if (arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}else {
					//���С�ھͲ��ı�˳��
				}
			}
		}*/
		String str = Arrays.toString(arr);
		System.out.println(str);
	}

}
