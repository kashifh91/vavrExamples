package com.kashif.vavr;

import io.vavr.Function2;
import io.vavr.control.Option;

public class FunctionLifting {

	public static void main(String[] args) {
		Function2<Integer, Integer, Integer> divide= (a,b) -> a/b;
		Function2<Integer, Integer, Option<Integer>> safeDivide=Function2.lift(divide);
		Option<Integer> i1 = safeDivide.apply(1, 1);
		System.out.println(i1.getOrElse(9999));
	}

}
