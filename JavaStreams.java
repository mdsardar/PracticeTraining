package org.javathoughts.sardar;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {
	public static void main(String... args) throws IOException {
		//IntStream.range(1, 15).skip(5).forEach(s -> System.out.println(s));
		/*System.out.println(
		IntStream.range(1, 5).sum()		
				);*/
		//Stream.of("Alfred","Altaf","Aarav").sorted().findFirst().ifPresent(System.out::print);;
		String[] names = {"Anu", "Chanu", "Banu", "Sardar", "Chandri"};
		
		Arrays.stream(names)
		//.filter(s -> s.startsWith("C"))
		.filter(s -> s.equalsIgnoreCase("ANU") || s.contains("ard"))
		//.filter(s -> s.equalsIgnoreCase("ANU"))
		.sorted()		
		.forEach(System.out::println);
		
		Arrays.stream(new int[] {2,4,6,8,10}).map(s -> s).average().ifPresent(System.out::println);
		
		List<String> people = Arrays.asList("Sara","Tara","Nalan","John");
		
		people.stream().map(String::toLowerCase).filter(x -> x.startsWith("t"))
				.forEach(System.out::println);
	}

}
