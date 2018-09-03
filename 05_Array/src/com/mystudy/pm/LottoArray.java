package com.mystudy.pm;

public class LottoArray {
	public static void main(String[] args) {
		//랜덤 한 숫자를 만들기 
		//Math.random() : 0.0 <= 리턴값 < 1
		// 0.0000 * 10 <= 범위 <= 0.9999 * 10 : 0.00 ~ 9.99999
		System.out.println(Math.random());
		System.out.println(Math.random() * 10);
		
		for (int i=0; i<100; i++) {
			System.out.print((int)(Math.random() * 45) + " ");
		}
		System.out.println();
		
		System.out.println("==================");
		/////////////////////////////
		//로또만들기
		//1. 정수값 45개를 저장할 수 있는 배열 선언
		int[] nums = new int[45];
		
		//2. 숫자 1~45를 배열에 저장
		for (int i=0; i<nums.length; i++) {
			nums[i] = i + 1;
		}
		printArray(nums);
		
		int rNum; //0~44까지의 숫자를 저장할 용도
		int temp;
		
		for (int i=0; i<10000; i++) {
			rNum = (int)(Math.random() * 45); //0~44 숫자 발생
			//nums[0] <-> nums[loc]
			temp = nums[0];
			nums[0] = nums[rNum];
			nums[rNum] = temp;
		}
		
		printArray(nums);
		//로또번호 추출 : 맨 앞에서 6개 번호 추출
		System.out.println("<로또번호 추첨 결과>");
		for (int i=0; i<6; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		
	}
	
	static void printArray(int[] arr) {
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
	}
}
