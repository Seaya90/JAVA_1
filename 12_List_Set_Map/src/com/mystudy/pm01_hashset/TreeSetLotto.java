package com.mystudy.pm01_hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetLotto {

	public static void main(String[] args) {
		//TreeSet : Set Ư�� + ����Ÿ�� ����
		
		//Set�� �̿��� �ζ� ����� : 1~45 �������� 6���� set�� ����
		//�ζǹ�ȣ 6���� ��÷�ϰ�, �������� ���� ������� ȭ�鿡 ǥ��
		//Math.random() : (int)(Math.random() * 45 + 1)
		//��°��
		// ������ �ζǹ�ȣ : 5, 8, 10, 25, 33, 44
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
		
		//�ζǹ�ȣ ��ǥ
		//Set -> List
		//Set�� �ִ� ����Ÿ�� Iterator�� ����ؼ� ��ȸ�ϰ� List�� �߰�
		
		//Treeset�� ����ϴ� ��쿡�� ����Ÿ�� ���ĵǾ� �����Ƿ� ���� �ʿ� ����
		ArrayList list = new ArrayList(lottoSet);
		Collections.reverse(list);
		
		System.out.println("�ζǹ�ȣ: " + list);
		
		((TreeSet)lottoSet).pollFirst();
		((TreeSet)lottoSet).pollLast();
		System.out.println(lottoSet);

	}

}
