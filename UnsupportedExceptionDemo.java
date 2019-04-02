package demo;

import java.util.Arrays;
import java.util.List;

public class UnsupportedExceptionDemo {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(new String[] { "ac", "bddefe" });
		list.remove(0);// throws UnsupportedOperationException
	}
}
