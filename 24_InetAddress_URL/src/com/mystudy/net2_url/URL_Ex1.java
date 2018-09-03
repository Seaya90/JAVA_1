package com.mystudy.net2_url;

import java.net.MalformedURLException;
import java.net.URL;

public class URL_Ex1 {

	public static void main(String[] args) throws MalformedURLException {
		//new URL(String protocol, String host, int port, String file)
		URL url = new URL("http", "java.sun.com", 8080, 
				"aaa/bbb/index.jsp?id=hong&password=1234#content");
		
		//프로토콜://호스트(서버):포트/경로(패스)?질의(query)
		url = new URL("https://sports.news.naver.com/kbaseball/news/read.nhn?oid=076&aid=0003310137");
		String protocol = url.getProtocol();
		String host = url.getHost();
		int port = url.getPort();
		int defaultPort = url.getDefaultPort();
		String path = url.getPath();
		String query = url.getQuery();
		String ref = url.getRef();
		
		System.out.println("프로토콜(protocol): " + protocol );
		System.out.println("호스트(host): " + host );
		System.out.println("포트번호(port): " + port );
		System.out.println("디폴트포트(defaultPort): " + defaultPort );
		System.out.println("경로-패스(path): " + path );
		System.out.println("쿼리-질문(query): " + query );
		System.out.println("참조(reference): " + ref );
	}

}
