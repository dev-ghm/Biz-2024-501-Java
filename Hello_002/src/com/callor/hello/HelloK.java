package com.callor.hello;
/*
 * 2 ~ 100까지 범위의 임의 Random 를 1개를 만들고
 * 그 수가 prime 인지 아닌지 판단
 */
public class HelloK {
	
	public static void main(String[] args) {
		int ran = (int)(Math.random() * 99) +2;
		int index = 0;
		boolean prime = true;
		for(int i=2; i <= ran/2; i++) {
			if(ran%i == 0) {
				prime = false;
				break;
			}
		}
		System.out.printf(prime ? ran + "은 소수입니다." : ran + "은 소수가 아닙니다");
		
//		for(index = 2; index < prime; index++ ) {
			
		}
	

}

