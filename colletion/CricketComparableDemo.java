package com.suresh.colletion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CricketComparableDemo {

	public static void main(String[] args) {
     List<Cricketer> cricketers= new ArrayList<Cricketer>();
     cricketers.add(new Cricketer("Bradman", 9996));
		cricketers.add(new Cricketer("Sachin", 14000));
		cricketers.add(new Cricketer("Dravid", 12000));
		cricketers.add(new Cricketer("Ponting", 11000));
		System.out.println(cricketers);
		Collections.sort(cricketers);

	}

	
}
