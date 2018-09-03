package com.mystudy.am;

public class Ex02_method_overloading {

	public static void main(String[] args) {
		//메소드(메서드,메쏘드) 오버로딩(method overloading)
		//정의 : 동일한 메소드명을 사용해서 서로 다른 기능을 구현
		//1. 하나의 클래스 내에서 동일한 메소드명으로 정의
		//2. 파라미터(parameter)의 타입, 갯수, 순서를 달리해서 작성
		//  - 메소드의 리턴타입은 무관 
        //메소드 오버로딩은 클래스 내에서 메소드를 중복선언
		String name = "홍길동";
		//int kor = 100, eng = 90, math = 80;
		int kor = 100;
		int eng = 90;
		int math = 81;
		int tot = kor + eng + math;
		double avg = (tot * 100) / 3 / 100.0;
		//avg = (int)((tot * 100) / 3.0) / 100.0;
		System.out.println(avg);
		
		System.out.println("--- 메소드 호출(실행) ---");
		displayData(name, avg, tot); //String, double, int
		displayData(name, tot, avg); //String, int, double
		
		//객체 생성
		Ex02_method_overloading mo = new Ex02_method_overloading();
		mo.displayData(name, avg);
		mo.displayData(avg);
		mo.displayData(name);
		mo.displayData(tot);
		mo.displayData(kor); //int 타입의 값만 전달되면 
		mo.displayData(kor, eng, math);
		mo.displayData(eng, math, kor); //타입과 순서가 같으면 동작
		
	}
	
	static void displayData(String name, double avg, int tot) {
		System.out.println("1. 이름: " + name + ", 총점: " + tot
				+ ", 평균: " + avg);
	}
	static void displayData(String name, int tot, double avg) {
		System.out.println("2. 이름: " + name + ", 총점: " + tot
				+ ", 평균: " + avg);
	}
	void displayData(String name, double avg) {
		System.out.println("3. 이름: "+ name +", 평균: " + avg);
	}
	
	//평균값만 받아서 출력
	void displayData(double avg) {
		System.out.println("평균: " + avg);
	}
	
	//이름만 받아서 출력
	void displayData(String name) {
		System.out.println("이름: "+ name);
	}
	
	//총점만 받아서 출력
	void displayData(int tot) {
		System.out.println("총점: "+ tot);
	}
	
	//국어, 영어, 수학 점수를 받아서 출력
	void displayData(int kor, int eng, int math) {
		System.out.println("국어: "+ kor + ", 영어: " + eng 
				+ ", 수학: " + math);
	}
    	

}





