package com.kashif.vavr;

import io.vavr.concurrent.Future;

public class FutureTest {
	public static void main(String ...strings) {
		Future<String> fut = Future.of(() -> strAppend())
				.onSuccess(v -> System.out.println("Successfull following is the result :" + v))
				.onFailure(v -> System.out.println("Failed......:" + v))
				.onComplete(v -> System.out.println("completed....:" + v));
		System.out.println("Yesssssssssss");

	}
	
	private static String strAppend() throws InterruptedException {
		Thread.sleep(2000);
		return "Hello";
	}
	
	
}
