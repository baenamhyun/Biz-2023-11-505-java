package com.callor.hello.var;

public class VarCA2 {
	
	public static void main(String[] args) {
		
		// 선언하는곳
		int scoreKor = 0;
		int scoreEng = 0;
		int scoreMath = 0;
		
		int total = 0;
		int avg = 0;
		
		// 데이터를 변수에 할당하는 곳
		scoreKor = 90;
		scoreEng = 80;
		scoreMath = 70;
		
		// 계산하ㅡㄴ 부분
		
	    total =scoreKor + scoreEng + scoreMath;
	    avg = total /3;
	    
	    // 출력하는 부분
	    System.out.println("=================");
	    System.out.println("성적표");
	    System.out.println("=================");
	    System.out.println("국어 : " + scoreKor);
	    System.out.println("영어 : " + scoreEng);
	    System.out.println("=================");
	    System.out.println("=================");
	    System.out.println("=================");
	    System.out.println("=================");
	}

}
