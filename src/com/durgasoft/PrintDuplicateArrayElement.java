package com.durgasoft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintDuplicateArrayElement {

	public static void main(String[] args) {
		String[] _duplicates = {"Java", "Hibernate", "Spring", "Java"};
		List<String> list=new ArrayList<>(Arrays.asList(_duplicates));
		List<String> _duplicateSet = new ArrayList<>();
		List<String> _nonDuplicateSet = new ArrayList<>();
		System.out.println("_duplicateSet:- "+_duplicateSet);
		System.out.println("_nonDuplicateSet:- "+_nonDuplicateSet);
		for (String elements : list) {
			if (_nonDuplicateSet.contains(elements))
				_duplicateSet.add(elements);	
			else
			_nonDuplicateSet.add(elements);

		}
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("_duplicateSet:- "+_duplicateSet);
		System.out.println("_nonDuplicateSet:- "+_nonDuplicateSet);
	}

}
