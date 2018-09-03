package com.mystudy.pm01_hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExam {

	public static void main(String[] args) {
		//Set ÀÎÅÍÆäÀÌ½º¸¦ ±¸ÇöÇÑ ±¸ÇöÃ¼
		//HashSet set = new HashSet();
		Set set = new HashSet();
		set.add("1"); //String
		set.add(new Integer(1)); //Integer
		set.add("È«±æµ¿");
		set.add("È«±æµ¿");
		System.out.println(set);
		
		set.remove("1");
		System.out.println(set);
		System.out.println("set.contains(1): " +set.contains(1));
		System.out.println("set.size(): " + set.size());
		
		set.add("±èÀ¯½Å");
		set.add("À»Áö¹®´ö");
		
		System.out.println("--- Set ÀüÃ¼ µ¥ÀÌÅ¸ Á¶È¸ ---");
		Iterator ite = set.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		//¼öÁ¤ : ±èÀ¯½Å -> È«°æ·¡  : ±èÀ¯½Å »èÁ¦ and È«°æ·¡ ÀÔ·Â
		System.out.println("±èÀ¯½ÅÀÌ ÀÖ³Ä? " + set.contains("±èÀ¯½Å"));
		set.remove("±èÀ¯½Å"); //»èÁ¦
		set.add("È«°æ·¡");
		ite = set.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		
	}

}
