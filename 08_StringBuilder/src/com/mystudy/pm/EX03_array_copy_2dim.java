package com.mystudy.pm;

import java.util.Arrays;

public class EX03_array_copy_2dim {

	public static void main(String[] args) {
		//1차원, 2차원 배열 복사
		//1차원 배열 복사
		int[] num1 = {10, 20, 30};
		System.out.println("int[] num1 : " + num1);
		System.out.println(Arrays.toString(num1));
		
		int[] numcopy = num1; //주소값 복사로 동일한 객체를 참조함
		
		//40 숫자 추가
		int[] num2 = new int[num1.length + 1];
		System.out.println(Arrays.toString(num2));
		
		for (int i=0; i<num1.length; i++) {
			num2[i] = num1[i];
		}
		System.out.println(Arrays.toString(num2));
		num2[3] = 40;
		System.out.println(Arrays.toString(num2));
		
		//-----------------------
		System.out.println("========= 2차원 배열 ======");
		//2차원 배열
		int[][] num2dim = {{10,20}, {30,40}, {50,60}};
		//Q1 : 2차원 배열 num2dim 값을 화면에 출력 : 10 20 30...
		for (int d2 = 0; d2 < num2dim.length; d2++) {
			for (int d1 = 0; d1 < num2dim[d2].length; d1++) {
				System.out.print(num2dim[d2][d1] + " ");
			}
		}
		System.out.println();
		
		//Q2 : num2dim에서 세번째 값인 30의 값을 100으로 변경하고 전체 화면 출력
		num2dim[1][0] = 100;
		for (int d2 = 0; d2 < num2dim.length; d2++) {
			for (int d1 = 0; d1 < num2dim[d2].length; d1++) {
				System.out.print(num2dim[d2][d1] + " ");
			}
		}
		System.out.println();
		
		//Q3 : num2dim와 동일한 형태의 배열변수 num2copy를 선언하고 객체생성.
		System.out.println("--- 2차원 배열 복사 ---");
		int[][] num2copy = new int[num2dim.length][num2dim[0].length];
		
		//num2copy[0][0] = num2dim[0][0];
		for (int d2 = 0; d2 < num2copy.length; d2++) {
			for (int d1 = 0; d1 < num2copy[d2].length; d1++) {
				num2copy[d2][d1] = num2dim[d2][d1];
			}
		}
		printData(num2copy);
		
//		//System.arraycopy 사용
//		for (int d2 = 0; d2 < num2copy.length; d2++) {
//			System.arraycopy(num2dim[d2], 0, num2copy[d2], 0, num2dim[d2].length);
//		}
		//복사 상태 체크
		num2copy[0][0] = 999;
		//원본과 복사본 출력
		System.out.println(">> 원본출력 ");
		printData(num2dim);
		
		System.out.println(">> 복사본출력 ");
		printData(num2copy);
		
		System.out.println(Arrays.toString(num2copy));
		
		//-------------------------
		System.out.println("==== 배열.clone() 복사 ====");
		int[][] num2clone = num2copy.clone();
		//주소값 복사 형태 인지 데이타 복사인지 확인(직접)
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




