package com.mystudy.pm01_map_sungjuk;

import java.util.HashMap;

public class SungjukTest {

	public static void main(String[] args) {
		//1. HashMap<String, Integer> 타입의 변수 sungjuk을 선언하고
		//2. map에 이름:점수 형태의 아래의 데이타를 입력
		//   "홍길동:100, 강감찬:90, 을지문덕:95, 계백:87, 김유신:92"
		//3. 입력된 데이타를 조회해서 점수의 총점을 tot에 저장
		//4. 총점(tot)의 값을 인원 수로 나눈 평균 값을 avg에 저장
		//5. 출력하시오.
		//   성명  점수
		//   -----------
		//   홍길동: 100
		//   강감찬: 90
		//   ...
		//   김유신: 92
		//   ==========
		//   총점: ???
		//   평균: ???
		////////////////////////////////////////////
		
		HashMapSungjukExam exam = new HashMapSungjukExam();
		exam.sungjuk = new HashMap<String, Integer>();
		exam.inputData();
		exam.displayData();
		exam.computeAvg();
		exam.computeTot();
//		System.out.println("총점: " + exam.tot);
//		System.out.println("평균: " + exam.avg);
		System.out.println();
		exam.printData();
		
	}

}
