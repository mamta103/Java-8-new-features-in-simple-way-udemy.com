package com.suresh.colletion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
		if (this.runs > cricketer.runs) {
			return -1;
		} else if (this.runs < cricketer.runs) {
			return 1;
		} else {
			return 0;
		}

	}

	public static void main(String[] args) {
		List<Cricketer> cricketers = new ArrayList<Cricketer>();
		cricketers.add(new Cricketer("Bradman", 9996));
		cricketers.add(new Cricketer("Sachin", 14000));
		cricketers.add(new Cricketer("Dravid", 12000));
		cricketers.add(new Cricketer("Ponting", 11000));
		System.out.println(cricketers);

		// Now let’s try to sort the cricketers.
		Collections.sort(cricketers);
		System.out.println(cricketers);

	}
}
