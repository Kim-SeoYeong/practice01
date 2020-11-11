package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1마일 = 1.609km 상수로 지정
		final double MILE = 1.609;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("마일을 입력하세요: ");
		int x = sc.nextInt();
		
		double total = x * MILE;
		System.out.println((double)x + "마일은 " + total + "킬로미터 입니다.");
	
	}

}
