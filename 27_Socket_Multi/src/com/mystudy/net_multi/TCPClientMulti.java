package com.mystudy.net_multi;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TCPClientMulti {

	public static void main(String[] args) {
		System.out.println("--- 클라이언트 시작 ----");
		Socket socket = null;
		InputStream is = null;
		OutputStream os = null;
		
		OutputStreamWriter osw = null;
		PrintWriter pw = null;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			socket = new Socket("localhost", 10000);
			is = socket.getInputStream();
			os = socket.getOutputStream();
			
			osw = new OutputStreamWriter(os);
			pw = new PrintWriter(osw);
			
			//메시지 쓰기
			while (true) {
				System.out.print("메시지입력> ");
				String msg = sc.nextLine();
				
				//서버쪽으로 전송
				pw.println(msg);
				pw.flush();
				if ("exit".equalsIgnoreCase(msg)) {
					System.out.println(">>> 종료합니다.");
					break;
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			pw.close();
			try {
				is.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}











