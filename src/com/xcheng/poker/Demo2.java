package com.xcheng.poker;

import java.util.ArrayList;
import java.util.Collections;

public class Demo2 {
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
		ArrayList<Cards2> c1 = toCards(member1);
		Collections.sort(c1);
		System.out.println(c1);
		System.out.println("=======================");
		System.out.println(member2);

		System.out.println("=======================");
		System.out.println(member3);

		System.out.println("=======================");
		System.out.println(dipai);

	}

	private static ArrayList<Cards2> toCards(ArrayList<String> member) {
		// TODO Auto-generated method stub
		ArrayList<Cards2> cards = new ArrayList<>();
		for (String str : member) {
			cards.add(new Cards2(str));
		}
		return cards;
	}

}
