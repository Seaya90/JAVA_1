package com.mystudy.am;

public class Ex02_StringBuilder {

	public static void main(String[] args) {
		//StringBuilder Ŭ����
		String str = new String("Hello World!!!");
		System.out.println(str);
		
		StringBuilder sb = new StringBuilder("Hello World!!!");
		System.out.println(sb);
		System.out.println("sb.length(): " + sb.length());
		System.out.println("sb.capacity(): " + sb.capacity());
		
		str = str + " �ݰ����ϴ�.";
		System.out.println(str);
		System.out.println(str.toString());
		System.out.println(str.replace("l", "L")); //��������Ÿ �������
		System.out.println(str);

		System.out.println("--- StringBuilder ---");
		sb.append(" �ݰ����ϴ�.");
		System.out.println(sb);
		System.out.println(sb.toString());
		
		System.out.println(sb.reverse()); //��������Ÿ ����
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
		//sb2.append("�ȳ��ϼ���. �ݰ����ϴ�!!");
		sb2.append("�ȳ��ϼ���.").append(" �ݰ����ϴ�!!");
		System.out.println("sb2: " + sb2);
		System.out.println("sb2.length(): " + sb2.length());
		System.out.println("sb2.capacity(): " + sb2.capacity());
		
		System.out.println("-- trimToSize() ���� �� ---");
		sb2.trimToSize();
		System.out.println("sb2: " + sb2);
		System.out.println("sb2.length(): " + sb2.length());
		System.out.println("sb2.capacity(): " + sb2.capacity());
		
		System.out.println(">> append() ���� ��");
		sb2.append(" �ڹٰ�����~");
		System.out.println("sb2: " + sb2);
		System.out.println("sb2.length(): " + sb2.length());
		System.out.println("sb2.capacity(): " + sb2.capacity());
		
		System.out.println(">> setLength() ������ ---");
		sb2.setLength(5);
		System.out.println("sb2: " + sb2);
		System.out.println("sb2.length(): " + sb2.length());
		System.out.println("sb2.capacity(): " + sb2.capacity());
		
	}

}
