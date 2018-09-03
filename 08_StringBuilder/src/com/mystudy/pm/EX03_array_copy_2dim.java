package com.mystudy.pm;

import java.util.Arrays;

public class EX03_array_copy_2dim {

	public static void main(String[] args) {
		//1����, 2���� �迭 ����
		//1���� �迭 ����
		int[] num1 = {10, 20, 30};
		System.out.println("int[] num1 : " + num1);
		System.out.println(Arrays.toString(num1));
		
		int[] numcopy = num1; //�ּҰ� ����� ������ ��ü�� ������
		
		//40 ���� �߰�
		int[] num2 = new int[num1.length + 1];
		System.out.println(Arrays.toString(num2));
		
		for (int i=0; i<num1.length; i++) {
			num2[i] = num1[i];
		}
		System.out.println(Arrays.toString(num2));
		num2[3] = 40;
		System.out.println(Arrays.toString(num2));
		
		//-----------------------
		System.out.println("========= 2���� �迭 ======");
		//2���� �迭
		int[][] num2dim = {{10,20}, {30,40}, {50,60}};
		//Q1 : 2���� �迭 num2dim ���� ȭ�鿡 ��� : 10 20 30...
		for (int d2 = 0; d2 < num2dim.length; d2++) {
			for (int d1 = 0; d1 < num2dim[d2].length; d1++) {
				System.out.print(num2dim[d2][d1] + " ");
			}
		}
		System.out.println();
		
		//Q2 : num2dim���� ����° ���� 30�� ���� 100���� �����ϰ� ��ü ȭ�� ���
		num2dim[1][0] = 100;
		for (int d2 = 0; d2 < num2dim.length; d2++) {
			for (int d1 = 0; d1 < num2dim[d2].length; d1++) {
				System.out.print(num2dim[d2][d1] + " ");
			}
		}
		System.out.println();
		
		//Q3 : num2dim�� ������ ������ �迭���� num2copy�� �����ϰ� ��ü����.
		System.out.println("--- 2���� �迭 ���� ---");
		int[][] num2copy = new int[num2dim.length][num2dim[0].length];
		
		//num2copy[0][0] = num2dim[0][0];
		for (int d2 = 0; d2 < num2copy.length; d2++) {
			for (int d1 = 0; d1 < num2copy[d2].length; d1++) {
				num2copy[d2][d1] = num2dim[d2][d1];
			}
		}
		printData(num2copy);
		
//		//System.arraycopy ���
//		for (int d2 = 0; d2 < num2copy.length; d2++) {
//			System.arraycopy(num2dim[d2], 0, num2copy[d2], 0, num2dim[d2].length);
//		}
		//���� ���� üũ
		num2copy[0][0] = 999;
		//������ ���纻 ���
		System.out.println(">> ������� ");
		printData(num2dim);
		
		System.out.println(">> ���纻��� ");
		printData(num2copy);
		
		System.out.println(Arrays.toString(num2copy));
		
		//-------------------------
		System.out.println("==== �迭.clone() ���� ====");
		int[][] num2clone = num2copy.clone();
		//�ּҰ� ���� ���� ���� ����Ÿ �������� Ȯ��(����)
	}
	
	static void printData(int[][] arr) {
		for (int d2 = 0; d2 < arr.length; d2++) {
			for (int d1 = 0; d1 < arr[d2].length; d1++) {
				System.out.print(arr[d2][d1] + " ");
			}
		}
		System.out.println();
	}


}




