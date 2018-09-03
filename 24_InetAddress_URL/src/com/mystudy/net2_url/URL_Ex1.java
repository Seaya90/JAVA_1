package com.mystudy.net2_url;

import java.net.MalformedURLException;
import java.net.URL;

public class URL_Ex1 {

	public static void main(String[] args) throws MalformedURLException {
		//new URL(String protocol, String host, int port, String file)
		URL url = new URL("http", "java.sun.com", 8080, 
				"aaa/bbb/index.jsp?id=hong&password=1234#content");
		
		//��������://ȣ��Ʈ(����):��Ʈ/���(�н�)?����(query)
		url = new URL("https://sports.news.naver.com/kbaseball/news/read.nhn?oid=076&aid=0003310137");
		String protocol = url.getProtocol();
		String host = url.getHost();
		int port = url.getPort();
		int defaultPort = url.getDefaultPort();
		String path = url.getPath();
		String query = url.getQuery();
		String ref = url.getRef();
		
		System.out.println("��������(protocol): " + protocol );
		System.out.println("ȣ��Ʈ(host): " + host );
		System.out.println("��Ʈ��ȣ(port): " + port );
		System.out.println("����Ʈ��Ʈ(defaultPort): " + defaultPort );
		System.out.println("���-�н�(path): " + path );
		System.out.println("����-����(query): " + query );
		System.out.println("����(reference): " + ref );
	}

}
