package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("500원 개수 : ");
		int x = sc.nextInt();
		System.out.print("100원 개수 : ");
		int y = sc.nextInt();
		System.out.print("50원 개수 : ");
		int z = sc.nextInt();
		System.out.print("10원 개수 : ");
		int p = sc.nextInt();
		
		int total = (500*x) + (100*y) + (50*z) + (10*p);
		
		System.out.println("동전의 총 합은 " + total + " 원 입니다.");
		
		sc.close();
	}

}
