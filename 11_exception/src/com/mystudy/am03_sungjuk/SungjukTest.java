package com.mystudy.am03_sungjuk;

public class SungjukTest {

	public static void main(String[] args) {
		System.out.println("--- main() 시작 ---");
		SungjukVO stu = new SungjukVO("홍길동", 100,90,80,270,90.0);
		System.out.println(stu.toString());
		stu.setKor(999);
		System.out.println(stu.toString());
		
		System.out.println("--- 영어 점수 처리 ---");
		try {
			stu.setEng(999);
		} catch (JumsuOutOfValueException e) {
			//e.printStackTrace();
			System.out.println(">> main() catch 처리: "+ e.getMessage());
		}
		System.out.println(stu.toString());
		
		System.out.println("--- main() 종료 ---");
	}

}
