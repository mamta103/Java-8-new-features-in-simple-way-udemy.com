package com.suresh.colletion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo01 {
	public static void main(String[] args) {
		List<String> arraylist = new ArrayList<String>(Arrays.asList("Sachin", "Dravid"));
		// adds at the index 0
		arraylist.add(0, "Ganguly");

		// List allows duplicates - Sachin is present in the list twice
		arraylist.add("Sachin");
		System.out.println(arraylist.size());
		System.out.println(arraylist);
		System.out.println(arraylist.contains("Dravid"));
		Iterator<String> arraylistIterator = arraylist.iterator();
		while (arraylistIterator.hasNext()) {
			String str = arraylistIterator.next();
			System.out.println(str);// Prints the 4 names in the list on
									// separate lines.
		}
		// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
		List<String> numbers = new ArrayList<String>(Arrays.asList("One", "Two", "Three", "Four"));
		// Strings - By Default - are sorted alphabetically
		Collections.sort(numbers);
		System.out.println(numbers);

	}
}
