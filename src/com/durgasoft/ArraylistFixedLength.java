package com.durgasoft;

import java.util.ArrayList;
import java.util.List;

public class ArraylistFixedLength {
public static void main(String[] args) {
	final List<Employee> list= new ArrayList<Employee>(1);
	Employee e1= new Employee();
	e1.setName("Ravi");

	list.add(e1);
	list.add(e1);
	list.add(e1);
	
	
	System.out.println(list);
	
}
}
