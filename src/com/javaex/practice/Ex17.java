package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.14;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름 : ");
		int ban = sc.nextInt();
		
		double volume = (4*PI*ban*ban*ban)/3;
		System.out.println("구의 부피는 : " + volume);
		
		sc.close();
	}

}
