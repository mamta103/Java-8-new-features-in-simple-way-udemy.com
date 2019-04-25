package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class InstanceOfDemo {

	public static void main(String[] args) throws ClassNotFoundException {

		ArrayList list= new ArrayList();
		System.out.println(list instanceof List);
		System.out.println(list instanceof Map);
		
	}

}
