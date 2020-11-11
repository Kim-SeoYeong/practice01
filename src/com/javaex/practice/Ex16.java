package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("상품가격 : ");
		int price = sc.nextInt();
		System.out.print("받은돈 : ");
		int money = sc.nextInt();

		double vat = price * 0.1;
		double change = money - price;
		System.out.println("=========================");
		System.out.println("받은돈 : " + (double)money);
		System.out.println("상품가격 : " + (double)price);
		System.out.println("부가세 : " + vat);
		System.out.println("잔액 : " + change);
	}

}
