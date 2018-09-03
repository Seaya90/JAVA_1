package com.mystudy.am;

import java.util.StringTokenizer;

public class Ex03_StringTokenizer {

	public static void main(String[] args) {
		//String.split() vs StringTokenizer
		System.out.println("--- String.split() ---");
		String str = "���,��,������,,����";
		System.out.println("str: " + str);
		String[] strSplit = str.split(",");
		
		System.out.println("-- str.split(\",\") ��� ---");
		for (int i=0; i<strSplit.length; i++) {
			System.out.print(strSplit[i] + "-");
		}
		System.out.println();
		
		//������ for��
		//for (����ŸŸ�� ������ : ���հ�ü) {}
		for (String str2 : strSplit) {
			System.out.print(str2 + "-");
		}
		System.out.println();
		System.out.println("�迭�� ����� ����Ÿ ����: " + strSplit.length);
		
		
		System.out.println("===================");
		System.out.println("--- StringTokenizer ��� ---");
		System.out.println("str: " + str); //"���,��,������,,����"
		StringTokenizer strToken = new StringTokenizer(str, ",");
		System.out.println("����� ��ū ����: " + strToken.countTokens());
		
		while (strToken.hasMoreTokens()) {
			String token = strToken.nextToken();
			System.out.print(token + "-");
		}
		System.out.println();
		System.out.println("����� ��ū ����: " + strToken.countTokens());
		
		//----------------------------------------------
		System.out.println("---- for�� ��� ----");
		strToken = new StringTokenizer(str, ",");
		System.out.println("����� ��ū ����: " + strToken.countTokens());
		int tokenCnt = strToken.countTokens();
		for (int i=0; i<tokenCnt; i++) {
			String token = strToken.nextToken();
			System.out.println((i+1) + " : " + token);
		}
		System.out.println();
		
		System.out.println("---- while�� ��� --");
		//�ǽ� : ���� ��� ���� �����ϰ� while������ ó��
		strToken = new StringTokenizer(str, ",");
		System.out.println("����� ��ū ����: " + strToken.countTokens());
		int index = 0;
		while (strToken.hasMoreTokens()) {
			index++;
			String token = strToken.nextToken();
			System.out.println(index + " :  " + token);
		}
		System.out.println();
		System.out.println("����� ��ū ����: " + strToken.countTokens());
		
	}

}