package com.mystudy.pm03_scanner;

import java.util.Scanner;

public class ScannerExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ�1: ");
		String str1 = sc.nextLine();
		System.out.println(">>>" + str1);
		
		System.out.print("���ڿ�2: ");
		String str2 = sc.nextLine();
		System.out.println(">>>" + str2);
		
		System.out.println("----------------");
		System.out.println("������ 2���� �Է��ϸ� ���� �� ���");
		System.out.print("����1: ");
		int num1 = sc.nextInt();
		
		System.out.print("����2: ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.println(num1 +" + "+ num2 +" = " + (num1 + num2));
	}

}



