package com.callor.hello.algorithm;

public class LoopK {
	public static void main(String[] args) {
		int range = 35;
		int sum=0;
		for(int i= 0 ; i < range ; i++) {
			sum += (i+1);
		}
		System.out.printf("1 ~ %d 까지 덧셈결괴 : %d ",range, sum);	
	}
}
