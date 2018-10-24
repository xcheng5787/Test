package com.xcheng.poker;

import java.util.ArrayList;
import java.util.Collections;

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
		System.out.println(toPoker(member1));
		System.out.println("=======================");
		System.out.println(member2);
		System.out.println(toPoker(member2));
		System.out.println("=======================");
		System.out.println(member3);
		System.out.println(toPoker(member3));
		System.out.println("=======================");
		System.out.println(dipai);

	}

	public static ArrayList<String> toPoker(ArrayList<String> c) {
		ArrayList<Cards> cards = new ArrayList<>();
		for (String s : c) {
			if (s == "小王") {
				cards.add(new Cards("♦", 16));
			} else if (s == "大王") {
				cards.add(new Cards("♦", 17));
			} else if (s.charAt(1) == 'A') {
				cards.add(new Cards(String.valueOf(s.charAt(0)), 14));
			} else if (s.charAt(1) == '2') {
				cards.add(new Cards(String.valueOf(s.charAt(0)), 15));
			} else if (s.charAt(1) == 'J') {
				cards.add(new Cards(String.valueOf(s.charAt(0)), 11));
			} else if (s.charAt(1) == 'Q') {
				cards.add(new Cards(String.valueOf(s.charAt(0)), 12));
			} else if (s.charAt(1) == 'K') {
				cards.add(new Cards(String.valueOf(s.charAt(0)), 13));
			} else {
				cards.add(new Cards(String.valueOf(s.charAt(0)), Integer.parseInt(s.substring(1))));
			}
		}
		Collections.sort(cards);
		return toPokerString(cards);

	}

	private static ArrayList<String> toPokerString(ArrayList<Cards> cards) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		for (Cards c : cards) {
			if (c.getNum() == 16) {
				list.add("小王");
			} else if (c.getNum() == 17) {
				list.add("大王");
			} else {
				list.add(c.getColor() + toNum(c.getNum()));
			}
		}
		return list;
	}

	private static String toNum(int num) {
		// TODO Auto-generated method stub
		if (num == 11) {
			return "J";
		} else if (num == 12) {
			return "Q";
		} else if (num == 13) {
			return "K";
		} else if (num == 14) {
			return "A";
		} else if (num == 15) {
			return "2";
		} else {
			return String.valueOf(num);
		}
	}

}
