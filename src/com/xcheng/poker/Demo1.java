package com.xcheng.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo1 {
	public static void main(String[] args) {
		// 买一副扑克
		String[] num = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		String[] color = { "♦", "♣", "♥", "♠" };
		ArrayList<String> poker = new ArrayList<>();
		for (String s1 : color) {
			for (String s2 : num) {
				poker.add(s1.concat(s2));
			}
		}
		poker.add("小王");
		poker.add("大王");
		// 洗牌
		Collections.shuffle(poker);
		// 发牌
		ArrayList<String> member1 = new ArrayList<>();
		ArrayList<String> member2 = new ArrayList<>();
		ArrayList<String> member3 = new ArrayList<>();
		ArrayList<String> dipai = new ArrayList<>();
		for (int i = 0; i < poker.size(); i++) {
			if (i >= poker.size() - 3) {
				dipai.add(poker.get(i));
			} else if (i % 3 == 0) {
				member1.add(poker.get(i));
			} else if (i % 3 == 1) {
				member2.add(poker.get(i));
			} else {
				member3.add(poker.get(i));
			}
		}
		// 看牌
		System.out.println(member1);
		System.out.println(member2);
		System.out.println(member3);
		System.out.println(dipai);

	}

	public static ArrayList<String> pokerSort(ArrayList<String> list) {
		// TODO Auto-generated method stub
		List<String> newList = new ArrayList<>();

		return null;
	}

}
