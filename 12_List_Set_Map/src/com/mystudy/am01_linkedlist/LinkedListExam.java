package com.mystudy.am01_linkedlist;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {
	
	public static void main(String[] args) {
		//LinkedList : List �Ӽ� 
		LinkedList list = new LinkedList();
		list.add("ȫ�浿");
//		list.add("ȫ�浿");
//		list.add("������");
//		System.out.println(list);
		
		String str = "ȫ�浿,������,������,��������,ȫ�淡";
		String[] strs = str.split(",");
		System.out.println("strs: " + Arrays.toString(strs));

		//�迭�� �ִ� ���� ����Ʈ�� �߰�
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
		
		//������ ����
		list.remove("������");
		printData("list", list);
		
		//ȫ�浿 -> ȫ�浿2 ����
		//ȫ�浿 �ε����� ã��, set �޼ҵ� ���
		System.out.println("ȫ�浿 ��ġ��(indexOf): " + list.indexOf("ȫ�浿"));
		//list.set(3, "ȫ�浿2");
		list.set(list.indexOf("ȫ�浿"), "ȫ�浿2");
		printData("list", list);
		
		System.out.println("--- ��ü����Ÿ ��ȣ:�̸� ���� ��� ---");
		//1:������
		//for(int i=0; �ۼ�
		for (int i = 0; i < list.size(); i++) {
			//                 1                  1
			System.out.println(i+1 +":"+ list.get(i));
		}
		//while�����ε� �ۼ�
		int i = 0; //�ʱⰪ ����
		while (i < list.size()) { //���ǽ�: ����/����
			System.out.println(i+1 +":"+ list.get(i));
			i++; //�������� ������
		}
	}
	
	static void printData(List list) {
		//null ���� Ȯ��
		if (list == null) return;
		
		System.out.print(list.get(0));
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println();
	}
	static void printData(String str, List list) {
		//null ���� Ȯ��
		if (list == null) return;
		
		System.out.print(str + ": ");
		System.out.print(list.get(0));
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println();
	}

}
