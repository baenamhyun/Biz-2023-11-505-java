package com.callor.hello.algorithm;

public class AlgF {
	public static void main(String[] args) {
		/*
		 * 우리나라 화폐는 5만, 1만, 5천, 1천, 5백, 1백, 50, 10원 단위이다 아래 pay 에 저장된 값에서 각각 화폐단위만큼 몇개씩이
		 * 포함되는지 출력하시오
		 * 
		 */
		int pay = 3587960;
		System.out.println("50000원권 : " + pay / 50000 + "매");// 37960
		System.out.println("10000원권 : " + pay % 50000 / 10000 + "매");// 7960
		System.out.println("5000원권 : " + pay % 50000 % 10000 / 5000 + "매");// 2960
		System.out.println("1000원권 : " + pay % 50000 % 10000 % 5000 / 1000 + "매");// 960
		System.out.println("500원권 : " + pay % 50000 % 10000 % 5000 % 1000 / 500 + "매");// 460
		System.out.println("100원권 : " + pay % 50000 % 10000 % 5000 % 1000 % 500 / 100 + "매");// 60
		System.out.println("50원권 : " + pay % 50000 % 10000 % 5000 % 1000 % 500 % 100 / 50 + "매");// 10
		System.out.println("10원권 : " + pay % 50000 % 10000 % 5000 % 1000 % 500 % 100 % 50 / 10 + "매");// 0

		
	}
}
