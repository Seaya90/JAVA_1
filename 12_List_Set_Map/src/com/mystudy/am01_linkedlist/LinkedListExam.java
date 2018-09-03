package com.mystudy.am01_linkedlist;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {
	
	public static void main(String[] args) {
		//LinkedList : List 속성 
		LinkedList list = new LinkedList();
		list.add("홍길동");
//		list.add("홍길동");
//		list.add("김유신");
//		System.out.println(list);
		
		String str = "홍길동,김유신,강감찬,을지문덕,홍경래";
		String[] strs = str.split(",");
		System.out.println("strs: " + Arrays.toString(strs));

		//배열에 있는 값을 리스트에 추가
		for (int i = 0; i < strs.length; i++) {
			list.add(strs[i]);
		}
		System.out.println("list: " + list);
		printData(list);
		printData("list", list);
		
		System.out.println("-------------");
		Collections.reverse(list);
		printData("list", list);
		
		Collections.sort(list);
		printData("list", list);
		
		//김유신 삭제
		list.remove("김유신");
		printData("list", list);
		
		//홍길동 -> 홍길동2 수정
		//홍길동 인덱스값 찾기, set 메소드 사용
		System.out.println("홍길동 위치값(indexOf): " + list.indexOf("홍길동"));
		//list.set(3, "홍길동2");
		list.set(list.indexOf("홍길동"), "홍길동2");
		printData("list", list);
		
		System.out.println("--- 전체데이타 번호:이름 형태 출력 ---");
		//1:강감찬
		//for(int i=0; 작성
		for (int i = 0; i < list.size(); i++) {
			//                 1                  1
			System.out.println(i+1 +":"+ list.get(i));
		}
		//while문으로도 작성
		int i = 0; //초기값 설정
		while (i < list.size()) { //조건식: 실행/종결
			System.out.println(i+1 +":"+ list.get(i));
			i++; //비교인자의 증감식
		}
	}
	
	static void printData(List list) {
		//null 여부 확인
		if (list == null) return;
		
		System.out.print(list.get(0));
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println();
	}
	static void printData(String str, List list) {
		//null 여부 확인
		if (list == null) return;
		
		System.out.print(str + ": ");
		System.out.print(list.get(0));
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println();
	}

}
