package com.callor.hello.prime;

public class primebb {
	public static void main(String[] args) {
		int num = 15;
		for(int index = 2 ; index < num ; index ++) {
			if (num % index == 0) {
				System.out.printf("%d MOD %d = %d, ", num, index, num%index);
				System.out.println(num + "는 소수가 아님");
				
			}
		}
				
	}
}
