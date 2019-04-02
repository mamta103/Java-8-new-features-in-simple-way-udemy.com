package com.suresh.colletion;

public class Cricketer implements Comparable<Cricketer> {

	int runs;
	String name;

	@Override
	public String toString() {
		return "Cricketer [runs=" + runs + ", name=" + name + "]";
	}

	public Cricketer(String name, int runs) {
		super();
		this.runs = runs;
		this.name = name;
	}

	@Override
	public int compareTo(Cricketer cricketer) {
		if (this.runs > cricketer.runs)
			return -1;
		else if (this.runs < cricketer.runs) {
			return 1;
		} else {
			return 0;
		}
	}

}
