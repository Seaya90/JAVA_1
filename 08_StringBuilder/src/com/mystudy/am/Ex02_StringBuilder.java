package com.mystudy.am;

public class Ex02_StringBuilder {

	public static void main(String[] args) {
		//StringBuilder 클래스
		String str = new String("Hello World!!!");
		System.out.println(str);
		
		StringBuilder sb = new StringBuilder("Hello World!!!");
		System.out.println(sb);
		System.out.println("sb.length(): " + sb.length());
		System.out.println("sb.capacity(): " + sb.capacity());
		
		str = str + " 반갑습니다.";
		System.out.println(str);
		System.out.println(str.toString());
		System.out.println(str.replace("l", "L")); //원본데이타 변경안함
		System.out.println(str);

		System.out.println("--- StringBuilder ---");
		sb.append(" 반갑습니다.");
		System.out.println(sb);
		System.out.println(sb.toString());
		
		System.out.println(sb.reverse()); //원본데이타 변경
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		System.out.println("---- delete(), insert(), replace() ---");
		System.out.println("sb.delete(0, 6) : " + sb.delete(0, 6));
		System.out.println("sb: " + sb);
		
		System.out.println("sb.insert(0, \"Hello \") : " 
				+ sb.insert(0, "Hello "));
		System.out.println("sb: " + sb);
		
		System.out.println("sb.replace(0, 5, \"Hi,\") : " 
				+ sb.replace(0, 5, "Hi,"));
		System.out.println("sb: " + sb);
		
		System.out.println("sb.length(): " + sb.length());
		System.out.println("sb.capacity(): " + sb.capacity());
		
		System.out.println("----------------------------");
		StringBuilder sb2 = new StringBuilder(100);
		System.out.println("sb2.length(): " + sb2.length());
		System.out.println("sb2.capacity(): " + sb2.capacity());
		
		System.out.println("----");
		//sb2.append("안녕하세요. 반갑습니다!!");
		sb2.append("안녕하세요.").append(" 반갑습니다!!");
		System.out.println("sb2: " + sb2);
		System.out.println("sb2.length(): " + sb2.length());
		System.out.println("sb2.capacity(): " + sb2.capacity());
		
		System.out.println("-- trimToSize() 실행 후 ---");
		sb2.trimToSize();
		System.out.println("sb2: " + sb2);
		System.out.println("sb2.length(): " + sb2.length());
		System.out.println("sb2.capacity(): " + sb2.capacity());
		
		System.out.println(">> append() 실행 후");
		sb2.append(" 자바공부중~");
		System.out.println("sb2: " + sb2);
		System.out.println("sb2.length(): " + sb2.length());
		System.out.println("sb2.capacity(): " + sb2.capacity());
		
		System.out.println(">> setLength() 실행후 ---");
		sb2.setLength(5);
		System.out.println("sb2: " + sb2);
		System.out.println("sb2.length(): " + sb2.length());
		System.out.println("sb2.capacity(): " + sb2.capacity());
		
	}

}
