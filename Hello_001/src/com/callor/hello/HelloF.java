package com.callor.hello;
/*
 * main method() 를 선언하고
 * 정수 30과 40을 변수에 저장하고
 * 1. 정수 30과 40을 덧셈하고
 * 2. 정수 30과 덧셈한 결과를 뺄셈하고
 * 3. 정수 40과 뺄셈한 결과를 곱셈하고
 * 4. 덧셈한 결과와 뺼셈한 결과를 나눗셈
 */

public class HelloF {
	
	public static void main(String[] args) {
		
		int a = 30;
		int b = 40;
		
		int c = a+b;
		int d = a-b;
		
		System.out.println(c);
		System.out.println(a - c);
		System.out.println(b * d);
		System.out.println(c / d);
		
	}

}
