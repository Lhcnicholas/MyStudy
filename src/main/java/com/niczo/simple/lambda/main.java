package com.niczo.simple.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class main {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		stringList.add("lhc");
		stringList.add("nqx");
		stringList.sort(SortedBy::length);
		stringList.sort(SortedBy::name);
		stringList.sort(SortedBy::nameIgnoreCase);

		Stream<Boolean> booleanStream = stringList.stream().map(String::isEmpty)
				.sorted();
		booleanStream.forEach(System.out::println);
	}
}

class SortedBy {

	static int length(String a, String b) {
		return a.length() - b.length();
	}

	static int name(String a, String b) {
		return a.compareTo(b);
	}

	static int nameIgnoreCase(String a, String b) {
		return a.toLowerCase().compareTo(b.toLowerCase());
	}
}
