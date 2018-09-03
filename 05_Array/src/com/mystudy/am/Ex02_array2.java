package com.mystudy.am;

public class Ex02_array2 {

	public static void main(String[] args) {
		//1~100까지의 수 중에 홀수의 합 구하기(배열사용)
		//문제1. 배열에 저장공간 갯수 50개 사용
		//저장공간만들기 int 타입의 값을 저장할 수 있는 크기 50인 배열 생성
		//1~100 숫자 중 홀수 값만 배열에 저장
		//배열에 저장된 값을 모두 더한 후 결과 출력
		
		//변수선언(배열타입)
		int[] odd = new int[50];
		System.out.println("odd[0] : " + odd[0]);
		
		//배열 초기화 - 배열에 홀수값 저장
		for (int i=0; i<odd.length; i++) {
			odd[i] = i * 2 + 1; //1, 3, 5, 
		}
		
		//배열값 출력
		for (int i=0; i<odd.length; i++) {
			System.out.println("인덱스 " + i + "값 : "+ odd[i]);
		}
		System.out.println();

		//배열의 값을 sum에 합산해서 출력
		//1~100까지 숫자중 홀수 합계: ???
		int sum = 0;
		for (int i=0; i<odd.length; i++) {
			sum = sum + odd[i];
		}
		System.out.println("1+3+5+...+99 : " + sum);
		
		///////////////////////////////
		//1~100까지의 수 중에서 홀수의 합 구하기(배열사용)
		//1~100까지의 숫자를 배열에 저장
		//1. 배열선언(int 타입의 값 100개 저장)
		//2. 배열 초기화(1~100까지의 숫자를 순서대로 배열에 저장)
		//3. 배열 값 중 홀수 값 추출해서 합산
		//4. 홀수값 합계 출력
		
		//1. 배열선언(int 타입의 값 100개 저장)
		System.out.println("=====================");
		int[] nums = new int[100];
		System.out.println("nums의 크기: " + nums.length);

		//2. 배열 초기화(1~100까지의 숫자를 순서대로 배열에 저장)
		for (int i=0; i<nums.length; i++) {
			nums[i] = i + 1;
		}
		
		//2-1. 입력된값 확인
		for (int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		//3. 배열 값 중 홀수 값 추출해서 합산
		sum = 0;
		for (int i=0; i<nums.length; i+=2) {
			//System.out.print(nums[i] + " ");
			sum += nums[i];
		}
		System.out.println("홀수 합 : " + sum);
		
		System.out.println("-----");
		sum = 0;
		for (int i=0; i<nums.length; i++) {
			if (nums[i] % 2 == 1) {
				sum += nums[i];
			}
		}
		System.out.println("홀수 합 : " + sum);
		
		//배열에 있는 값 중 짝수는 짝수끼리 합산, 홀수는 홀수끼리 합산해서 결과 출력
		int oddSum = 0; //홀수합
		int evenSum = 0; //짝수합
		for (int i=0; i<nums.length; i++) {
			if (nums[i] % 2 == 0) {
				evenSum += nums[i];
			} else {
				oddSum += nums[i];
			}
		}
		System.out.println("홀수합계: " + oddSum + ", 짝수합계: " + evenSum);
	}

}





