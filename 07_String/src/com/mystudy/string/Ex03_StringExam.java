package com.mystudy.string;

public class Ex03_StringExam {

	public static void main(String[] args) {
		/* 문자열 주민번호 처리 
		String str = "900108-1234567"; //주민번호
		문제1. 정확히 입력이 된 데이타 인지 확인
		     (전체자리수 14, '-' 위치: 7번째)  
		문제4. 데이타 값 검증
		      (월: 1~12, 일: 1~31)
		문제2. 생년월일 출력
		문제3. 성별확인하고 출력(1,3: 남성, 2,4: 여성)
		참고 : int num = Integer.parseInt("12"); //"12" -> 12
		*/
		String str = "900108-2234567";
		
		//문제1.정확히 입력이 된 데이타 인지 확인(전체자리수 14, '-' 위치: 7번째)
		//1-1 입력된 주민번호의 문자열 길이가 14인지 비교 확인(if문 사용)
		int strLen = str.length();
		//if (str.length() == 14) {
		if (strLen == 14) {
			System.out.println("[정상] 주민번호 크기 " + strLen + "자리");
		} else {
			System.out.println("[예외발생] 주민번호가 " + strLen +"자리로 입력되었습니다.");
			System.out.println("주민번호는 14자리(예: 901108-1234567)로 입력해야합니다.");
		}
		
		//1-2 주민번호 문자열에서 '-'의 위치가 7번째 인지 비교 확인(if문 사용)
		//System.out.println(str.indexOf("-"));
		int barLoc = str.indexOf("-") + 1; //인덱스 + 1
		//if (barLoc != 7) {
		if (str.indexOf("-") + 1 != 7  ) {
			System.out.println("[예외발생] 문자 '-'가 7번째 위치가 아닙니다. 확인하세요");
		} else {
			System.out.println("[정상] 문자 '-'가 7번째에 정상 입력되었습니다.");
		}
		
		//-------------------------------
		//문제4. 데이타 값 검증(월: 1~12, 일: 1~31)
		//4-1 주민번호의 3~4번째 숫자 값 추출하고 1~12 범위의 값인지 확인(if문 사용)
		//System.out.println(str.substring(2, 4));
		//String month = str.substring(2, 4); //"01"
		int mm = Integer.parseInt(str.substring(2, 4));
		
		if (mm >= 1 && mm <= 12) {
			System.out.println("[정상] 생월이 1~12의 값으로 정상 입력");
		} else {
			System.out.println("[예외발생] 생월이 1~12 값이 아닙니다.");
		}
		
		//4-2 주민번호의 5~6번째 숫자 값 추출하고 1~31 범위의 값인지 확인(if문 사용)
		int dd = Integer.parseInt(str.substring(4, 6));
		
		if (dd >= 1 && dd <= 31) {
			System.out.println("[정상] 일자가 1~31의 값으로 정상 입력");
		} else {
			System.out.println("[예외발생] 일자가 1~31 값이 아닙니다.");
		}
		
		//---------------------------------
		//문제2. 생년월일 출력(00년 00월 00일)
		//2-1 생년 값 추출 
		String sYY = str.substring(0, 2);
		//2-2 생월 값 추출
		String sMM = str.substring(2, 4);
		//2-3 생일 값 추출
		String sDD = str.substring(4, 6);
		
		//2-4 생년월일 출력 (00년 00월 00일 출생) 90년 01월 08일
		String yymmdd = sYY + "년 " + sMM +"월 "+ sDD +"일"; 
		System.out.println("생년월일: " + yymmdd);
		
		//------------------------------
		//문제3. 성별확인하고 출력(1,3: 남성, 2,4: 여성)
		//3-1 주민번호에서 '-' 다음의 숫자를 추출하고(8번째 위치)
//		System.out.println(str.charAt(7));
//		System.out.println(str.charAt(str.indexOf("-") + 1));
		char gender = str.charAt(7);
		
		//3-2 성별 숫자 값과 비교 후 출력 (1,3: 남성, 2,4: 여성)
		if (gender == '1' || gender == '3') {
			System.out.println("성별 : 남성");
		} else if (gender == '2' || gender == '4' ) {
			System.out.println("성별 : 여성");
		} else {
			System.out.println("[예외발생] 성별값이 1~4가 아닙니다");
		}
	}

}
