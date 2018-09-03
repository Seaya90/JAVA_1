package com.mystudy.string;

public class Ex02_String2 {

	public static void main(String[] args) {
		//String 메소드들
		String st1 = "java";
		System.out.println(st1);
		System.out.println(st1.toString());
		
		System.out.println("--- indexOf() ---");
		System.out.println(st1.indexOf("a"));
		
		System.out.println("--- isEmpty() ---");
		//st1 = "";
		System.out.println("st1.isEmpty(): " + st1.isEmpty());
		
		System.out.println("--- replace() ---");
		System.out.println("st1 : " + st1);
		System.out.println(st1.replace('a', 'b')); //원본데이타는 유지됨
		System.out.println("st1 : " + st1);
		
		st1 = "java java";
		System.out.println("st1: " + st1);
		System.out.println(st1.replaceAll("ja", "Ja"));
		System.out.println(st1.replaceFirst("ja", "Ja"));

		System.out.println(st1.indexOf("a"));
		System.out.println(st1.indexOf("a", st1.indexOf("a")+1));
		
		///////////////////////////////////////
		System.out.println("--- substring() ----");
		String str = "Java World";
		System.out.println("str : " + str);
		System.out.println("str.substring(5): " + str.substring(5));
		
		//substring(beginIndex, endIndex) begin 부터, end 이전까지
		System.out.println(str.substring(2, 4)); 
		System.out.println(str.substring(0, str.length()));
		//뒤에서 2개 문자 제외
		System.out.println(str.substring(0, str.length()-2));
		
		System.out.println("--- toCharArray() ---");
		char[] ch = str.toCharArray(); //문자열을 char[] 변환
		System.out.println(ch[0]);
		
		System.out.println("--- toUpperCase(), toLowerCase() ----");
		System.out.println("str: " + str);
		System.out.println("대문자로 toUpperCase(): " + str.toUpperCase());
		System.out.println("대문자로 toLowerCase(): " + str.toLowerCase());
		
		System.out.println("--- trim() ----");
		String str2 = "   ab c D   EFG   ";
		System.out.println("str2: -" + str2 +"-");
		System.out.println("trim() : -" + str2.trim() +"-");
		
		System.out.println("--- valueOf() ---");
		int num = 100;
		str2 = String.valueOf(num); //static 메소드 valuOf 사용
		System.out.println("num: " + num);
		System.out.println(num + 1);
		System.out.println(String.valueOf(num) + 1);
		
		//////////
		int num2 = Integer.parseInt("200"); //int <- String
		
	}

}
