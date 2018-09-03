package com.mystudy.am01_exception;

public class ExceptionFinally {

	public static void main(String[] args) {
		//try ~ catch ~ finally
		System.out.println("--- main() 시작 ---");
		int num = 20;
		try {
			System.out.println(">> try문 시작");
			System.out.println(">> 연산처리 시작");
			num = 0;
			int result = 100 / num; //예외발생 가능 : 0으로 나눔
			System.out.println(">> 연산처리 정상실행");
			System.out.println(">> try문 끝");
		} catch (ArithmeticException e) {
			System.out.println(">>>> catch문 실행");
		} finally {
			System.out.println("**>> finally : 항상 실햄(무조건)");
		}
		
		System.out.println("---------------");
		System.out.println("test() 실행 결과: " + test());
		
		System.out.println("--- main() 종료 ---");
	}
	
	
	static String test() {
		String result = "";
		int[] num = new int[3];
		
		try {
			num[3] = 100;
			result = "<정상실행>";
		} catch (Exception e) {
			result = "<예외발생>" + e.getMessage();
			e.printStackTrace();
		} finally {
			System.out.println("finally: 무조건 실행");
		}
		
		return result;
	}
	

}
