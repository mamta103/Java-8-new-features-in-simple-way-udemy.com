package com.durgasoft;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Program to remove duplicates from a List in Java 8 
public class RemovingArrayDuplicateJdk8 {
	private <String> boolean isNotNull(final String item) {
		return item != null;
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("ABC");
		list.add("ABC");
		list.add("ABC");
		list.add(null);
		list.add(null);

		List<String> newList = list.stream().distinct().filter(x -> x != "ABC").collect(Collectors.toList());
		// newList.stream().filter(this::isNotNull).collect(Collectors.toList());

		// list.stream().distinct().collect(Collectors.toList());
		// newList.removeAll(Collections.singleton(null));

		System.out.println(newList);

	}

}
