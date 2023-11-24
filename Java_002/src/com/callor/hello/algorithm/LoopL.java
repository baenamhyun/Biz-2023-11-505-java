package com.callor.hello.algorithm;

public class LoopL {
	public static void main(String[] args) {
		int range = 100;
		int sum = 0;
		for(int i=0 ; i < range ; i++) {
			if((i+1) % 2 == 0 ){
				sum += (i+1);
			}
		}
		System.out.printf("1 부터 100 까지의 짝수만 덧셈 결과 : %3d  "  ,sum);
		
		
			
	}
}
