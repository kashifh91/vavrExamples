package com.kashif.vavr;

import io.vavr.collection.List;
import io.vavr.collection.Stream;

public class ColletionTest {

	public static void main(String[] args) {
		System.out.println(List.of(1,2,3,4).sum());
		
		Stream<Integer> intStream = Stream.iterate(0, i->i+1).take(10);
		intStream.forEach(i->System.out.println(i));
		System.out.println(intStream.filter(i->i%2==0).sum());
	}

}
