package com.mystudy.pm;

public class Ex01 {

	public static void main(String[] args) {
		//변수값 교환하기
		int i = 100;
		int k = 200;
		System.out.println("i: " + i + ", k: " + k);
		
		//i <-> k
		int temp = 0;
		temp = i;
		i = k;
		k = temp;
		
		System.out.println("i: " + i + ", k: " + k);

		System.out.println("==================");
		///////////////////////////////
		//             0    1    2    3    4
		int[] nums = {100, 200, 300, 400, 500};
		System.out.println("배열의 크기: " + nums.length);
		printArray(nums);
		
		//nums[0] <-> nums[4]
		temp = nums[0];
		nums[0] = nums[4];
		nums[4] = temp;
		printArray(nums);
		
		//nums[1] <-> nums[3]
		temp = nums[1];
		nums[1] = nums[3];
		nums[3] = temp;
		printArray(nums);
		
		//배열의 값이 몇 개가 되었든 동일한 형태로 변경할 수 있는 문장 작성
	}
	
	static void printArray(int[] arr) {
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
	}

}
