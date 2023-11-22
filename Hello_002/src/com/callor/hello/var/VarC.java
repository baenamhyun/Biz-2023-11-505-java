package com.callor.hello.var;

public class VarC {
	
	public static void main(String[] args) {
		int scoreKor =0;
		int scoreEng =0;
		int scoreMath =0;
		
		int total = 0;
		int value = 0;
		
		scoreKor = 98;
		scoreEng = 90;
		scoreMath = 55;
		
		total = scoreKor + scoreEng + scoreMath;
		value = total/3;
		
		
		System.out.println("================");
		System.out.println("국어 : " + scoreKor);
		System.out.println("영어 : " + scoreEng);
		System.out.println("수학 : " + scoreMath);
		System.out.println("-----------------");
		System.out.println("총점 : " + total);
		System.out.println("평균 : "+ value);
		System.out.println("=================");
	}

}
