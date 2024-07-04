package com.callor.hello;

/*
 * 정수형 배열 100개를 선언하고,
 * 임의의 Random 수를 생성하여 배열 100개에 할당하기
 */
public class HelloI {
	public static void main(String[] args) {
		int[] nums = new int[100];
		for(int i=0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 100) + 1;
		}
		for(int i = 0; i < nums.length; i++) {
			
		}
	}

}
