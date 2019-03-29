package com.setter.dependency.injection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class LambdaExpression_predicate {

	@Test
	public void test() {
		List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 1, 2, 6, 2, 3));
		numbers.stream().filter((number) -> (number % 2 != 0)).forEach(number -> System.out.print(number + ""));
		System.out.println("\n");
		numbers.stream().distinct().forEach(System.out::print);
		System.out.println("\n");

		numbers.stream().distinct().sorted().forEach(System.out::print);
		System.out.println("\n");

	}
	@Test
	public void streamExample_Filter() {
	//137
	}

}
