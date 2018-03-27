package com.kashif.vavr;

import io.vavr.Tuple;
import io.vavr.Tuple2;

public class TupleExample {

	public static void main(String ... args) {
		Tuple2<String, Integer> java8 = Tuple.of("java", 8);
		
		String str = java8._1; 

		System.out.println(str);
		Integer in = java8._2;
		System.out.println(in);
		Tuple2<String, Integer> java81=java8.map((s,i)->Tuple.of(s.substring(2)+"vr",i/8));
		str = java81._1; 

		System.out.println("81: "+str);
		in = java81._2;
		System.out.println("81: "+in);
		
		
		str = java8._1; 

		System.out.println(str);
		in= java8._2;
		System.out.println(in);

	}
}
