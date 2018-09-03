package com.mystudy.pm01_inner_class;

//����ƽŬ���� : Ŭ���� ��������� ������ ������ static��  �ٿ� �ۼ�
public class StaticClass {
	int a = 10;
	private int b = 100;
	static int c = 200;
	
	static class Inner {
		static int d = 1000;
		int e = 2000;
		void printData() {
			//System.out.println("int a: " + a); //static���� non-static ��� ����
			//System.out.println("private int b: " + b);
			System.out.println("static int c: " + c);
			System.out.println("static int d: " + d);
			System.out.println("Inner int e: " + e);
		}
	}
	
	public static void main(String[] args) {
		int num = StaticClass.c;
		StaticClass.Inner inner = new StaticClass.Inner();
		inner.printData();
	}

}
