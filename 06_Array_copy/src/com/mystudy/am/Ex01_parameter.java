package com.mystudy.am;

public class Ex01_parameter {
	public static void main(String[] args) {
		//파라미터 값을 전달할 때
		//1. 값이 전달되는 경우 : 기본데이타 타입
		//2. 주소값이 전달되는 경우 : 참조형 데이타 타입
		//   참조형 데이타 타입을 전달받아 값을 변경시 원본데이타의 값도 변경됨
		int num = 100;
		int[] arr = {100, 200, 300};
		
		System.out.println("정수 num: " + num);
		changeData(num);
		System.out.println("changeData실행후 num: " + num);
		
		System.out.println("--- 참조형 데이타 전달 ----");
		System.out.print("정수배열 arr: ");
		printData(arr);
		
		changeData(arr);
		
		System.out.print("changeDate 실행후 arr: ");
		printData(arr);
		
	}
	
	//메소드 오버로딩(method overloading)
	//클래스 파일 내에서 동일한 메소드명으로 파라미터를 다르게 정의하여
	//동일한 메소드명으로 다르게 동작하도록 처리
	
	static void changeData(int intValue) {
		System.out.println(">> 전달받은 int : " + intValue);
		intValue = 999;
		System.out.println(">> 변경된 int : " + intValue);
	}
	
	static void changeData(int[] intArr) {
		System.out.print(">> 전달받은 int배열: ");
		printData(intArr);
		
		//배열값 변경
		intArr[0] = 999;
		System.out.print(">> 변경후 int배열: ");
		printData(intArr);
	}
	
	
	static void printData(int[] num) {
		for (int i=0; i<num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}

}
