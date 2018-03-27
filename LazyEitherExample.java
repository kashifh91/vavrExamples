package com.kashif.vavr;

import io.vavr.Lazy;
import io.vavr.control.Either;

public class LazyEitherTest {

	public static void main(String ...strings) {
		Lazy<Double> lazy = Lazy.of(Math::random);
		System.out.println(lazy.isEvaluated()); // = false
		System.out.println(lazy.get());         // = 0.123 (random generated)
		System.out.println(lazy.isEvaluated()); // = true
		lazy.get();
		
		Either<String,Integer> value = result(90);
		if(value.isLeft()) {
			System.out.println(value.getLeft());
		}else {
			System.out.println(value.get());
		}
	}
	
	public static Either<String, Integer> result(int marks){
		if(marks<40)
			return Either.left(" You Failed..!!!!");
		else
			return Either.right(marks);
	}
}
