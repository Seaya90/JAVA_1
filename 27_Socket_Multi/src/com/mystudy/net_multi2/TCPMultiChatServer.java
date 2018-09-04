package com.mystudy.net_multi2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;

public class TCPMultiChatServer {
	HashMap<String, DataOutputStream> clients;

	public static void main(String[] args) {
		//클래스 객체 생성 후 serverStart() 메소드 호출
		new TCPMultiChatServer().serverStart();
	}
	
	TCPMultiChatServer() {
		clients = new HashMap<>();
	}
	
	//서버소켓 생성하고 대기하다가
	//클라이언트가 접속하면 메시지를 받기 위한 쓰레드 생성
	private void serverStart() {
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			//포트번호 10000번으로 서버 소켓 생성
			serverSocket = new ServerSocket(10000);
			System.out.println(">> 서버가 시작되었습니다....");
			System.out.println("서버IP:포트 - " 
					+ InetAddress.getLocalHost().getHostAddress()
					+ ":" + serverSocket.getLocalPort());
			
			while (true) {
				socket = serverSocket.accept();
				System.out.println("[" + socket.getInetAddress()
						+ ":" + socket.getPort() + "] 접속");
				
				//접속된 클라이언트에 대한 처리 : 쓰레드 생성
				ServerReceiver thread = new ServerReceiver(socket);
				thread.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	//ServerReceiver : 전달받은 Socket을 이용해서 메시지 받고, 전체에게 전달
	//생성될 때 : clients에 추가
	//종료할 때 : clients에서 삭제
	class ServerReceiver extends Thread {
		Socket socket;
		DataInputStream in;
		DataOutputStream out;
		String ip;
		String name;
		
		
		ServerReceiver(Socket socket) {
			this.socket = socket;
			try {
				in = new DataInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());
				
				ip = socket.getInetAddress().getHostAddress();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		@Override
		public void run() {
			//생성될 때 : clients에 추가
			//종료할 때 : clients에서 삭제
			//메시지를 받고 접속된 모든 사람에게 메시지 전달
			
			try {
				name = in.readUTF(); //클라이언트가 입력한 첫 메시지
				System.out.println("접속자>> " + name);
				
				//접속인원 전체에게 접속자 입장 알림
				sendToAll("#" + name + "님이 입장했습니다.");
				
				//접속자 목록에 등록
				clients.put(name, out);
				
//				while(true) {
//					String msg = in.readUTF();
//					sendToAll(msg);
//				}
				
				while (true) {
					String msg = in.readUTF();
					System.out.println(msg); //서버화면출력
					sendToAll(msg); //접속자에게 전달
				}
				
			} catch (IOException e) {
				//e.printStackTrace();
			} finally {
				clients.remove(name); //접속자 목록에서 삭제
				//접속자에게 퇴장 메시지 전송
				String outMsg = "<"+ name + ">님이 나갔습니다.";
				sendToAll(outMsg);
				System.out.println(outMsg);
				
				System.out.println("현재 접속자 수: " + clients.size());
			}
		}

		private void sendToAll(String msg) {
			//접속자 전체에게 메시지 전달
			Iterator<String> ite = clients.keySet().iterator();
			while (ite.hasNext()) {
				DataOutputStream out = clients.get(ite.next());
				try {
					out.writeUTF(msg);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
	}

}












