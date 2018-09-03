package com.mystudy.am01_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExam2 {

	public static void main(String[] args) {
		//Map�� ����� ����Ÿ�� Ȯ��
		Map<String, String> map = new HashMap<String, String>();
		map.put("Ű1", "��1");
		map.put("Ű2", "��2");
		map.put("Ű3", "��3");
		map.put("Ű4", "��4");
		map.put("Ű5", "��5");
		System.out.println(map);

		int[] num = {1, 2, 3, 4};
		System.out.println("--- �⺻���� for�� �迭�� ��� ---");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		
		System.out.println("--- ������ for��(forEach) �̿� �迭�� ��� ---");
		for (int n : num) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		
		//(�ǽ�)Entry Ÿ���� ���� �޾Ƽ� Ű(key)-��(value) ��ȸ(iterator)
		System.out.println("--- Map.Entry Ÿ���� ����Ÿ ��ȸ ---");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() +":"+ entry.getValue());
		}
		System.out.println();
		
		System.out.println("--- Map.Entry Ÿ���� ����Ÿ ��ȸ(iterator) ---");
		//Set<String> stringSet;
		Set<Map.Entry<String, String>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, String>> ite = entrySet.iterator();
		while (ite.hasNext()) {
			Map.Entry<String, String> entry = ite.next();
			System.out.println(entry.getKey() +":"+ entry.getValue());
		}
		
		//--------------------------------------
		//Map ��½� ������ for�� ���
		System.out.println("--- Map�� ������ for������ ��ȸ ---");
		for (String key : map.keySet()) {
			System.out.println("key: " + key + ", value: "+ map.get(key));
		}
		//(�ǽ�)Ű(key)�� �޾Ƽ� Ű(key)-��(value) ��ȸ(iterator)
		
		System.out.println("--- Map���� Ű(key) Set�� �޾Ƽ� ��ȸ(iterator) ---");
		Iterator<String> iteString = map.keySet().iterator();
		while (iteString.hasNext()) {
			String key = iteString.next();
			String value = map.get(key);
			System.out.println(key + ":" + value);
		}
		
		
	}

}





