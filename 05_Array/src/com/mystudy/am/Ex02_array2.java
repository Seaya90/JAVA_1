package com.mystudy.am;

public class Ex02_array2 {

	public static void main(String[] args) {
		//1~100������ �� �߿� Ȧ���� �� ���ϱ�(�迭���)
		//����1. �迭�� ������� ���� 50�� ���
		//������������ int Ÿ���� ���� ������ �� �ִ� ũ�� 50�� �迭 ����
		//1~100 ���� �� Ȧ�� ���� �迭�� ����
		//�迭�� ����� ���� ��� ���� �� ��� ���
		
		//��������(�迭Ÿ��)
		int[] odd = new int[50];
		System.out.println("odd[0] : " + odd[0]);
		
		//�迭 �ʱ�ȭ - �迭�� Ȧ���� ����
		for (int i=0; i<odd.length; i++) {
			odd[i] = i * 2 + 1; //1, 3, 5, 
		}
		
		//�迭�� ���
		for (int i=0; i<odd.length; i++) {
			System.out.println("�ε��� " + i + "�� : "+ odd[i]);
		}
		System.out.println();

		//�迭�� ���� sum�� �ջ��ؼ� ���
		//1~100���� ������ Ȧ�� �հ�: ???
		int sum = 0;
		for (int i=0; i<odd.length; i++) {
			sum = sum + odd[i];
		}
		System.out.println("1+3+5+...+99 : " + sum);
		
		///////////////////////////////
		//1~100������ �� �߿��� Ȧ���� �� ���ϱ�(�迭���)
		//1~100������ ���ڸ� �迭�� ����
		//1. �迭����(int Ÿ���� �� 100�� ����)
		//2. �迭 �ʱ�ȭ(1~100������ ���ڸ� ������� �迭�� ����)
		//3. �迭 �� �� Ȧ�� �� �����ؼ� �ջ�
		//4. Ȧ���� �հ� ���
		
		//1. �迭����(int Ÿ���� �� 100�� ����)
		System.out.println("=====================");
		int[] nums = new int[100];
		System.out.println("nums�� ũ��: " + nums.length);

		//2. �迭 �ʱ�ȭ(1~100������ ���ڸ� ������� �迭�� ����)
		for (int i=0; i<nums.length; i++) {
			nums[i] = i + 1;
		}
		
		//2-1. �ԷµȰ� Ȯ��
		for (int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		//3. �迭 �� �� Ȧ�� �� �����ؼ� �ջ�
		sum = 0;
		for (int i=0; i<nums.length; i+=2) {
			//System.out.print(nums[i] + " ");
			sum += nums[i];
		}
		System.out.println("Ȧ�� �� : " + sum);
		
		System.out.println("-----");
		sum = 0;
		for (int i=0; i<nums.length; i++) {
			if (nums[i] % 2 == 1) {
				sum += nums[i];
			}
		}
		System.out.println("Ȧ�� �� : " + sum);
		
		//�迭�� �ִ� �� �� ¦���� ¦������ �ջ�, Ȧ���� Ȧ������ �ջ��ؼ� ��� ���
		int oddSum = 0; //Ȧ����
		int evenSum = 0; //¦����
		for (int i=0; i<nums.length; i++) {
			if (nums[i] % 2 == 0) {
				evenSum += nums[i];
			} else {
				oddSum += nums[i];
			}
		}
		System.out.println("Ȧ���հ�: " + oddSum + ", ¦���հ�: " + evenSum);
	}

}





