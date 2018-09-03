package com.mystudy.pm;

public class LottoArray {
	public static void main(String[] args) {
		//���� �� ���ڸ� ����� 
		//Math.random() : 0.0 <= ���ϰ� < 1
		// 0.0000 * 10 <= ���� <= 0.9999 * 10 : 0.00 ~ 9.99999
		System.out.println(Math.random());
		System.out.println(Math.random() * 10);
		
		for (int i=0; i<100; i++) {
			System.out.print((int)(Math.random() * 45) + " ");
		}
		System.out.println();
		
		System.out.println("==================");
		/////////////////////////////
		//�ζǸ����
		//1. ������ 45���� ������ �� �ִ� �迭 ����
		int[] nums = new int[45];
		
		//2. ���� 1~45�� �迭�� ����
		for (int i=0; i<nums.length; i++) {
			nums[i] = i + 1;
		}
		printArray(nums);
		
		int rNum; //0~44������ ���ڸ� ������ �뵵
		int temp;
		
		for (int i=0; i<10000; i++) {
			rNum = (int)(Math.random() * 45); //0~44 ���� �߻�
			//nums[0] <-> nums[loc]
			temp = nums[0];
			nums[0] = nums[rNum];
			nums[rNum] = temp;
		}
		
		printArray(nums);
		//�ζǹ�ȣ ���� : �� �տ��� 6�� ��ȣ ����
		System.out.println("<�ζǹ�ȣ ��÷ ���>");
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
