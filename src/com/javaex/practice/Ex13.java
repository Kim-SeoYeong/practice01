package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//환율 1달러 = 1230.95원 상수로 지정

		final double DOLLAR = 1230.95;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("환전할 원화를 입력하세요 : ");
		int won = sc.nextInt();
		
		double total = won / DOLLAR;
		System.out.println("받으실 달러는 " + total);

	}

}
