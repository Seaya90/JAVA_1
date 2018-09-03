package com.mystudy.pm02_list_studentvo;

import java.util.ArrayList;

public class StudentManagerList {
	private ArrayList<StudentVO> sungjuk = new ArrayList<>();
	static final String TITLE = "이름\t국어\t영어\t수학\t총점\t평균";
	static final String LINE = "-----------------------"
				+ "------------------------------";
	void inputBasicData() {
		sungjuk.add(new StudentVO("홍길동", 100,90,81));
		sungjuk.add(new StudentVO("김유신", 90,90,90));
		sungjuk.add(new StudentVO("홍경래", 80,80,80));
	}
	
	void inputData(StudentVO vo) {
		sungjuk.add(vo);
	}
	void inputData(String name, int kor, int eng, int math) {
		sungjuk.add(new StudentVO(name, kor, eng, math));
	}
	
	//[구현실습] 전달받은 VO의 name과 
	//sungjuk 목록에 있는 VO중 name이 같은 데이타 삭제 
	boolean deleteData(StudentVO vo) {
		//StudentVO 타입의 값을 전달받아 sungjuk 목록에서 삭제
		boolean result = false;
		
		
		return result;
	}
	
	//[구현실습] 이름을 받아서 같은 이름의 객체 삭제
	boolean deleteData(String name) {
		//이름을 전달받아 sungjuk 에서 삭제 처리
		boolean result = false;
		
		
		return result;
		
	}
	
	//[구현실습] 전달받은 VO의 name과 
	//sungjuk 목록에 있는 VO중 name이 같은 데이타 수정
	boolean updateData(StudentVO vo) {
		//1.이름을 전달받아 sungjuk 에서 찾고
		//2.찾았으면 전달받은 VO의 점수,총점,평균으로 sungjuk에서 찾은 VO값 변경
		boolean result = false;
		System.out.println(vo);
		
		return result;
	}
	
	
	//[구현실습]
	StudentVO getData(String name) {
		StudentVO result = null;
		//전달받은 이름을 가지고 있는 StudentVO 객체 찾기
		
		return result;
	}
	
	//[구현실습]점수 이상인 사람 목록 조회
	ArrayList<StudentVO> getData(double avg) {
		ArrayList<StudentVO> result = null;
		
		//list에 있는 데이타에서 전달받은 평균값(avg) 이상인 데이타 찾아서
		//result에 담아서 리턴
		
		return result;
	}
	
	//전체 데이타 출력(타이틀 출력없이 데이타만)
	void printDataAll() {
		//sungjuk 필드에 담겨있는 데이타만 출력
		for (StudentVO vo : sungjuk) {
			printDataOne(vo, "\t");
		}
	}
	
	//하나의 데이타를 출력(VO와 출력구분자)
	void printDataOne(StudentVO vo, String delim) {
		if (vo == null) return;
		System.out.print(vo.getName());
		System.out.print(delim + vo.getKor());
		System.out.print(delim + vo.getEng());
		System.out.print(delim + vo.getMath());
		System.out.print(delim + vo.getTot());
		System.out.print(delim + vo.getAvg());
		System.out.println();
	}
	void printTitle() {
		System.out.println(TITLE);
		System.out.println(LINE);
	}
	void printSungjuk() {
		printTitle();
		printDataAll();
		
		
	}
}
