package com.mystudy.pm;

public class Ex04_array_copy_diff {

	public static void main(String[] args) {
		//2차원 배열 복사 : 1차원 배열의 크기가 다를 때
		int[][] nums = {{10,20}, {30,40,50}, {60}}; 
		printData(nums);
		
		int[][] dest = new int[nums.length][];
		dest[0] = new int[nums[0].length]; 
		dest[1] = new int[nums[1].length];
		dest[2] = new int[nums[2].length];
		printData(dest);
		
		//위의 문장을 반복문으로 변경(실습)
		
		//원본(nums) -> 복사본(dest) 복사 
		//복사후 값 체크까지 
		
		
		
		
	}//main end
	
	static void printData(int[][] arr) {
		for (int d2 = 0; d2 < arr.length; d2++) {
			for (int d1 = 0; d1 < arr[d2].length; d1++) {
				System.out.print(arr[d2][d1] + " ");
			}
			System.out.println();
		}
		System.out.println("----------");
	}

}
