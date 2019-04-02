package com.suresh.colletion;

import java.util.Comparator;

public class Cricketer implements Comparator<Cricketer> {

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

	public int compareTo(Cricketer cricketer) {
		if (this.runs > cricketer.runs)
			return -1;
		else if (this.runs < cricketer.runs) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public int compare(Cricketer cricketer1, Cricketer cricketer2) {

		if (cricketer1.runs > cricketer2.runs)
			return 1;
		else if (cricketer1.runs < cricketer2.runs)
			return -1;
		else
			return 0;
	}

	public Cricketer() {
		super();
	}
	

}
