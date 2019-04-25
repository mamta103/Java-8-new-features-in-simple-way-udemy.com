package com.equal.hashcode;

import java.util.HashMap;
import java.util.Map;

public class HashcodeEqualDemo {

	public static void main(String[] args) {
 
		Employee emp1= new Employee(1);
		Employee emp2= new Employee(1);
		Map<Employee,String> map=new HashMap<Employee,String>(); 
		map.put(emp1, "Jack");
		map.put(emp2, "Jack");
		
		System.out.println("Map size:: "+map.size());
		
		Integer i1= new Integer(1);
		Integer i2= new Integer(1);
		Map<Integer, String> map2= new HashMap<Integer,String>();
		map2.put(i1, "Jack");
		map2.put(i2, "Jack");
		System.out.println("Map2 Size ::"+map2.size());

		
	}

}

class Employee {
	int id;

	
	public Employee(int id) {
		super();
		this.id = id;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	

}