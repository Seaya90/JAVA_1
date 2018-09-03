package com.mystudy.socket04_echo_while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TCPClientEchoWhile {

	public static void main(String[] args) {
		//메시지를 작성해서 서버로 전송하고, 서버로부터 전달받은 메시지 수신 반복
		//메시지 작성 : Scanner 객체 사용해서 콘솔창에서 입력
		//작성 메시지 서버로 전송(Output) 후에 수신(Input)해서 받은 메시지 화면 출력
		
		Socket socket = null;
		
		//byte단위 입출력 처리 객체 변수
		InputStream is = null;
		OutputStream os = null;
		
		//필터 : byte -> char(문자)처리 형태로 변경하는 객체 저장 변수
		InputStreamReader isr = null;
		OutputStreamWriter osw = null;
		
		//필터 : 버퍼(buffer) 사용으로 라인단위 입출력 처리용 객체 저장 변수
		BufferedReader br = null;
		PrintWriter pw = null;
		
		System.out.println("---- 클라이언트 시작 ----");
		try {
			socket = new Socket("localhost", 10000);
			
			//연결된 소켓과 데이타를 주고 받기 위한 I/O 객체 생성
			is = socket.getInputStream();
			os = socket.getOutputStream();
			
			//필터 추가 : 바이트(byte) 단위 처리 객체를 문자(char)단위 처리 객체로 전환
			//byte -> char
			isr = new InputStreamReader(is);
			osw = new OutputStreamWriter(os);
			
			//필터 추가 : 버퍼(buffer)사용으로 편리하게 라인단위 입출력
			br = new BufferedReader(isr);
			pw = new PrintWriter(osw);
			
			//데이타를 작성해서 전송
			Scanner scan = new Scanner(System.in);
			
			while (true) {
				//메시지 작성
				System.out.print("메시지입력> ");
				String msg = scan.nextLine();
				
				//서버로 메시지 보내기 
				pw.println("[클라이언트]" + msg);
				pw.flush();
				
				//exit 문자열을 입력해서 작업 종료
				if ("exit".equalsIgnoreCase(msg)) {
					break;
				}
				
				//서버에서 보내온 메시지 받아서 화면 출력
				String reMsg = br.readLine();
				System.out.println("from서버> " + reMsg);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			pw.close();
			try {
				br.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("---- 클라이언트 종료 ----");
	}

}
