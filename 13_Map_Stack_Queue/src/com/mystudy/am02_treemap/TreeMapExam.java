package com.mystudy.am02_treemap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapExam {

	public static void main(String[] args) {
		//Map : Ű(key)-��(value) ������ ����Ÿ�� ����
		// - ������ ����(�� TreeMap�� ��� key�� �������� ���ĵǾ� ����)
		// - Ű(key) : �ߺ���� ���� ����
		// - ��(value) : �ߺ����
		TreeMap map = new TreeMap();
		//      key     value
		map.put("ȫ�浿", 100); //100 -> Integer 100
		map.put("������", new Integer(95));
		map.put("������", 88); 
		map.put("���", 88); 
		map.put("ȫ�浿", 93); //������ key���� �����ϸ� ����ó����
		map.put("A", 93);
		map.put("*", 93); 
		map.put("100", 93); 
		System.out.println(map);
		
		HashMap map2 = new HashMap();
		map2.put("������", 92);
		map2.put("����ġ", 82);
		System.out.println(map2);
		
		System.out.println("map.isEmpty(): " + map.isEmpty());
		System.out.println("map.get(\"ȫ�浿\"): " + map.get("ȫ�浿"));
		System.out.println("map.get(\"��������\"): " + map.get("��������"));
		System.out.println("map.containsKey(\"��������\"): " + map.containsKey("��������"));
		System.out.println("map.containsValue(88): " + map.containsValue(88));
		
		//////////////////////////////////////////////
		//Map�� Ű(key), ��(value)�� �Բ� �����ؼ� ���
		System.out.println("---- Ű(key)-��(value) ���� : entrySet() ---");
		Set set = map.entrySet();
		System.out.println(set); //[ȫ�浿=93, ������=95, ���=88, ������=88]
		Iterator ite = set.iterator();
		while (ite.hasNext()) {
			Map.Entry e = (Entry) ite.next(); //Map.Entry <- Object
			System.out.println("�̸�:"+ e.getKey() + ", ����:"+ e.getValue());
		}
		
		//-------------
		System.out.println("---- Ű(key) ���� : keySet() ---");
		set = map.keySet();
		System.out.println(set);
		
		ite = set.iterator();
		while (ite.hasNext()) {
			Object key = ite.next();
			Integer value = (Integer) map.get(key);
			System.out.println("key:"+ key + ", value:"+ value);
		}
		
		//------------
		System.out.println("--- ��(value)�� ���� ��� : values() ---");
		Collection values = map.values();
		ite = values.iterator();
		int sum = 0;
		while (ite.hasNext()) {
			Integer num = (Integer) ite.next();
			System.out.print(num + " ");
			sum += num;
		}
		System.out.println("\n�����հ�: " + sum);

	}

}
