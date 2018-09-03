package com.mystudy.pm01_hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetLotto {

	public static void main(String[] args) {
		//Set�� �̿��� �ζ� ����� : 1~45 �������� 6���� set�� ����
		//�ζǹ�ȣ 6���� ��÷�ϰ�, �������� ���� ������� ȭ�鿡 ǥ��
		//Math.random() : (int)(Math.random() * 45 + 1)
		//��°��
		// ������ �ζǹ�ȣ : 5, 8, 10, 25, 33, 44
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
		
		//�ζǹ�ȣ ��ǥ
		//Set -> List
		//Set�� �ִ� ����Ÿ�� Iterator�� ����ؼ� ��ȸ�ϰ� List�� �߰�
		ArrayList list = new ArrayList(lottoSet);
		Collections.sort(list);
		
		System.out.println("�ζǹ�ȣ: " + list);
		
	}

}
