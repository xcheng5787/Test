package com.xcheng.poker;

public class Cards2 implements Comparable<Cards2> {
	private String str;

	public Cards2(String str) {
		super();
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return str;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((str == null) ? 0 : str.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cards2 other = (Cards2) obj;
		if (str == null) {
			if (other.str != null)
				return false;
		} else if (!str.equals(other.str))
			return false;
		return true;
	}

	@Override
	public int compareTo(Cards2 c) {
		// TODO Auto-generated method stub
		if (this.getStr().equals("大王")) {
			return 1;
		} else if (this.getStr().equals("小王")) {
			if (c.getStr().equals("大王")) {
				return -1;
			} else {
				return 1;
			}
		} else {
			if (c.getStr().equals("大王") || c.getStr().equals("小王")) {
				return -1;
			} else {
				if (formart(this.getStr()) > formart(c.getStr())) {
					return 1;
				} else if (formart(this.getStr()) == formart(c.getStr())) {
					if (Integer.valueOf(this.getStr().charAt(0)) > Integer.valueOf(c.getStr().charAt(0))) {
						return 1;
					} else {
						return -1;
					}
				} else {
					return -1;
				}
			}
		}
	}

	private int formart(String s) {
		// TODO [♥9, ♠A, ♠Q, ♣9, ♦K, ♦2, ♥J, ♦3, ♦4, ♠6, ♦10, ♣J, ♥6, ♠4, ♠2, ♣3, ♥5]
//		System.out.println(s.substring(1));
		if (s.substring(1).equals("J")) {
			return 11;
		} else if (s.substring(1).equals("Q")) {
			return 12;
		} else if (s.substring(1).equals("K")) {
			return 13;
		} else if (s.substring(1).equals("A")) {
			return 14;
		} else if (s.substring(1).equals("2")) {
			return 15;
		} else {
			return Integer.valueOf(s.substring(1));
		}
	}

}
