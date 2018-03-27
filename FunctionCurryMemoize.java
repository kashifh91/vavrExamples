package com.kashif.vavr;

import io.vavr.Function0;
import io.vavr.Function1;
import io.vavr.Function3;

public class FunctionCurryMemoize {

	public static void main(String[] args) {
		Function3<Integer, Integer, Integer, Integer> sum = (a, b, c) -> a - b - c;
		final Function1<Integer, Function1<Integer, Integer>> add2 = sum.curried().apply(6);
		System.out.println(add2.apply(2).apply(3));
		
		
		Function0<Double> hashCache=Function0.of(Math::random).memoized();
		Double random1=hashCache.get();
		Double random3=hashCache.apply();
		Double random2=hashCache.get();
		System.out.println("value1 :"+random1 +"  value2 :"+random2 +"  value3 :"+random3);
	}

}
