package com.xcheng.poker;

public class Cards implements Comparable<Cards> {
	String color;
	int num;

	public Cards(String color, int num) {
		super();
		this.color = color;
		this.num = num;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return color + num;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + num;
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
		Cards other = (Cards) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (num != other.num)
			return false;
		return true;
	}

	@Override
	public int compareTo(Cards c) {
		// TODO 对比传入的Cards
		if (this.getNum() > c.getNum()) {
			return 1;
		} else if (this.getNum() == c.getNum()) {
			if (this.getColor().charAt(0) > c.getColor().charAt(0)) {
				return 1;
			}
		} else {
			return -1;
		}
		return 0;
	}

}
