package com.mystudy.pm;

import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.jar.Attributes.Name;

import javax.xml.transform.stax.StAXResult;

public class StringControlExam {

	public static void main(String[] args) {
		/* 문자열 다루기
		0.문자열 데이터
		  String str1 = "홍길동 이순신   이순신 Tom 홍길동"
		  String str2 = "     TOM    을지문덕 김유신 연개소문"
		1. 위의 문자열을 StringBuilder 변수 sb를 이용해서 하나의 문자열로 만들고,
		2. sb의 문자열을 빈칸(" ")을 구분자로 잘라서(이름만 추출) 화면 출력
		   (String.split() 또는 StringTokenizer 사용)
		3. 구분자 콤마(,)로 구분하여 한라인에 출력(StringBuilder 사용)
		   (출력예: 홍길동,이순신,이순신,Tom,홍길동,TOM,을지문덕,김유신,연개소문)
		4. 데이터의 첫글자만 추출해서 콤마(,)로 구분하여 한라인에 출력(StringBuilder 사용)
		   (예: 홍,이,이,T,홍,T,을,김,연) 
		5. 배열의 문자열중 이름의 글자수가 4 이상인 값을 "인덱스번호:이름" 출력
		       출력예: 
		   6:을지문덕
		   8:연개소문
		********************************/
		String str1 = "홍길동 이순신   이순신 Tom 홍길동";
		String str2 = "     TOM    을지문덕 김유신 연개소문";
		//"홍길동 이순신   이순신 Tom 홍길동     TOM    을지문덕 김유신 연개소문"
		//1. 위의 문자열을 StringBuilder 변수 sb를 이용해서 하나의 문자열로 만들고,
		StringBuilder sb = new StringBuilder();
		sb.append(str1).append(str2);
		System.out.println(sb.toString());
		
		//2. sb의 문자열을 빈칸(" ")을 구분자로 잘라서(이름만 추출) 화면 출력
		//   (String.split() 또는 StringTokenizer 사용)
		StringTokenizer stk = new StringTokenizer(sb.toString(), " ");
		
		//잘라낸 데이타를 배열에 저장
		int tokenCnt = stk.countTokens();
		String[] names = new String[tokenCnt];
		
		//names <- stk 값을 저장
		for (int i=0; i<tokenCnt; i++) {
			names[i] = stk.nextToken();
		}
		System.out.println(Arrays.toString(names));
		
		for (String name : names) {
			System.out.print(name + " ");
		}
		System.out.println();
		
		//3. 구분자 콤마(,)로 구분하여 한라인에 출력(StringBuilder 사용)
		//   (출력예: 홍길동,이순신,이순신,Tom,홍길동,TOM,을지문덕,김유신,연개소문)
		StringBuilder sbResult = new StringBuilder();
		
		System.out.println("방법1 -----------------------");
		for (int i=0; i<names.length; i++) {
			//마지막 데이타면
			if (i == names.length - 1) {//마지막인지 확인
				sbResult.append(names[i]);
			} else {
				sbResult.append(names[i]).append(",");
			}
		}
		System.out.println(sbResult.toString());
		
		System.out.println("방법2 -----------------------");
		sbResult.setLength(0);
		boolean isFirst = true;
		for (String name : names) {
			if (isFirst) {//첫번째 데이타 인지 확인
				sbResult.append(name);
				isFirst = false;
			} else {
				sbResult.append(",").append(name);
			}
		}
		System.out.println(sbResult.toString());
		
		System.out.println("방법3 -----------------------");
		sbResult.setLength(0);
		if (names.length > 0) {
			sbResult.append(names[0]); //첫번째 데이타 처리
		}
		for (int i=1; i<names.length; i++) {//2번째 데이타부터 처리 
			sbResult.append(",").append(names[i]);
		}
		System.out.println(sbResult.toString());
		
		//----------------------------------
		//4. 데이터의 첫글자만 추출해서 콤마(,)로 구분하여 한라인에 출력(StringBuilder 사용)
		//   (예: 홍,이,이,T,홍,T,을,김,연) 
		sbResult.setLength(0);
		isFirst = true;
		for (String name : names) {
			if (isFirst) {
				sbResult.append(name.charAt(0)); //substring(0,1)
				isFirst = false;
			} else {
				sbResult.append(",").append(name.charAt(0));
			}
		}
		System.out.println(sbResult.toString());
		
		//------------------------------
		//5. 배열의 문자열중 이름의 글자수가 4 이상인 값을 "인덱스번호:이름" 출력
		//   출력예: 
		//   6:을지문덕
		//   8:연개소문
		sbResult.setLength(0);
		int idx = 0;
		for (String str : names) {
			if (str.length() >= 4) {
				System.out.println(idx + ":" + str);
			}
			idx++;
		}
		
		
	}

}
