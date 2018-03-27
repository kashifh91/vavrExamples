package com.kashif.vavr;

import io.vavr.Function2;
import io.vavr.control.Try;

public class TryTest {
	public static void main(String ...strings) {
	
		Try<Integer> res=divide(1,0);
		res.onFailure(t->t.printStackTrace()).onSuccess(a->System.out.println(a));
	}

	public static Try<Integer> divide (Integer a,Integer b) {
		return Try.of(()-> a/b);
	}
	 
}
