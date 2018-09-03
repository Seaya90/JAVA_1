package com.mystudy.pm01_hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetLotto {

	public static void main(String[] args) {
		//TreeSet : Set 특성 + 데이타의 정렬
		
		//Set을 이용한 로또 만들기 : 1~45 랜덤숫자 6개를 set에 저장
		//로또번호 6개를 추첨하고, 작은숫자 부터 순서대로 화면에 표시
		//Math.random() : (int)(Math.random() * 45 + 1)
		//출력결과
		// 금주의 로또번호 : 5, 8, 10, 25, 33, 44
		Set lottoSet = new TreeSet();

		for (int i = 0; lottoSet.size() < 6; i++) {
			lottoSet.add((int)(Math.random() * 45 + 1));
		}
		System.out.println(lottoSet);
		
		System.out.println("------");
		lottoSet.clear();
		for (; lottoSet.size() < 6; ) {
			lottoSet.add((int)(Math.random() * 45 + 1));
		}
		System.out.println(lottoSet);
		
		System.out.println("----");
		lottoSet.clear();
		while (lottoSet.size() < 6) {
			lottoSet.add((int)(Math.random() * 45 + 1));
		}
		System.out.println(lottoSet);
		
		//로또번호 발표
		//Set -> List
		//Set에 있는 데이타를 Iterator를 사용해서 조회하고 List에 추가
		
		//Treeset을 사용하는 경우에는 데이타가 정렬되어 있으므로 정렬 필요 없음
		ArrayList list = new ArrayList(lottoSet);
		Collections.reverse(list);
		
		System.out.println("로또번호: " + list);
		
		((TreeSet)lottoSet).pollFirst();
		((TreeSet)lottoSet).pollLast();
		System.out.println(lottoSet);

	}

}
