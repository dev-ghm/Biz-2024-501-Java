package com.callor.hello;

/*
 * 10 ~ 50 범위의 임의 Random 정수 1개를 생성하고
 * 생성한 Random 수 만큼의 정수형 배열을 선언하고
 * 배열의 각 요소의 1 ~ 100까지 범위의 Random 수를 저장
 * 배열에 저장된 값을 출력
 */
public class HelloJ {
	
	public static void main(String[] args) {
		int ran = (int)(Math.random() * 41) +10;
		int[] nums = new int[ran];
		for(int i=0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 100) + 1;
//			System.out.println(nums[i]);
		}
		for(int num : nums) {
			System.out.print(num);
			System.out.print(" ");
		}
		System.out.println("\n" + "=".repeat(30));
//		생성된 nums 의 요소들 전체를 합산하고, 평균을 계산하여 출력
		float plus = 0;
		float avg = 0;
		for(int num2 :nums) {
		plus += num2;
		avg = plus / ran;
		}
		System.out.println("합계:" + plus);
		System.out.printf("평균:%.2f",avg);
	}
	
}
