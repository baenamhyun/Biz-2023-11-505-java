package com.callor.hello.algorithm;

public class Loopi {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			int num = i + 1;
			if (num % 7 == 0) {
				System.out.printf("%3d", num);

			}
		}
	}
}
