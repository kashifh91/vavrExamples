package com.kashif.vavr;

import io.vavr.control.Option;

public class OptionTest {

	public static void main(String ... args) {
		Option<String> maybeFoo = Option.of("foo"); 
		System.out.println((maybeFoo.get()).equals("foo"));
		Option<String> maybeFooBar = maybeFoo.flatMap(s -> Option.of((String)null)) 
		                                     .map(s -> s.toUpperCase() + "bar");
		System.out.println(maybeFooBar.isEmpty());
	}
}
