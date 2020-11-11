package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로를 입력하세요 : ");
		float x = sc.nextFloat();
		System.out.print("세로를 입력하세요 : ");
		float y = sc.nextFloat();
		
		float width = x*y;
		float circumference = (x+y)*2;

		System.out.println("사각형의 넓이는 : " + width);
		System.out.println("사각형의 둘레는 : " + circumference);
		
		sc.close();
	}

}
