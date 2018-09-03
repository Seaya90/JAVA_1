package com.mystudy.pm01_hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetLotto {

	public static void main(String[] args) {
		//Set을 이용한 로또 만들기 : 1~45 랜덤숫자 6개를 set에 저장
		//로또번호 6개를 추첨하고, 작은숫자 부터 순서대로 화면에 표시
		//Math.random() : (int)(Math.random() * 45 + 1)
		//출력결과
		// 금주의 로또번호 : 5, 8, 10, 25, 33, 44
		Set lottoSet = new HashSet();
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
		ArrayList list = new ArrayList(lottoSet);
		Collections.sort(list);
		
		System.out.println("로또번호: " + list);
		
	}

}
