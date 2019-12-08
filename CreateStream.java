package org.sardar.java;

import java.util.*;
import java.util.stream.*;

public class CreateStream {
	public static void main(String... args) {
		Integer[] arr1 = new Integer[] { 6, 6, 8, 9, 1, 12, (int) -1.0};
		Stream<Integer> myStream = Arrays.stream(arr1);
		System.out.println("Value of Stream " + myStream);

		double numElements = myStream.filter((i) -> i >= 1).count();
		System.out.println("Value of Stream Count > 1 " + numElements);

		numElements = Arrays.stream(arr1).filter((i) -> i > 9).count();
		System.out.println("Value of Stream Count > 2 " + numElements);

	}
}
