package com.mystudy.pm01_inner_class;

//스태틱클래스 : 클래스 구성멤버와 동일한 레벨에 static을  붙여 작성
public class StaticClass {
	int a = 10;
	private int b = 100;
	static int c = 200;
	
	static class Inner {
		static int d = 1000;
		int e = 2000;
		void printData() {
			//System.out.println("int a: " + a); //static에서 non-static 사용 못함
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
