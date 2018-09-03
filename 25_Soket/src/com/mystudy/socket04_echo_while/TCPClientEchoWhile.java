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
		//�޽����� �ۼ��ؼ� ������ �����ϰ�, �����κ��� ���޹��� �޽��� ���� �ݺ�
		//�޽��� �ۼ� : Scanner ��ü ����ؼ� �ܼ�â���� �Է�
		//�ۼ� �޽��� ������ ����(Output) �Ŀ� ����(Input)�ؼ� ���� �޽��� ȭ�� ���
		
		Socket socket = null;
		
		//byte���� ����� ó�� ��ü ����
		InputStream is = null;
		OutputStream os = null;
		
		//���� : byte -> char(����)ó�� ���·� �����ϴ� ��ü ���� ����
		InputStreamReader isr = null;
		OutputStreamWriter osw = null;
		
		//���� : ����(buffer) ������� ���δ��� ����� ó���� ��ü ���� ����
		BufferedReader br = null;
		PrintWriter pw = null;
		
		System.out.println("---- Ŭ���̾�Ʈ ���� ----");
		try {
			socket = new Socket("localhost", 10000);
			
			//����� ���ϰ� ����Ÿ�� �ְ� �ޱ� ���� I/O ��ü ����
			is = socket.getInputStream();
			os = socket.getOutputStream();
			
			//���� �߰� : ����Ʈ(byte) ���� ó�� ��ü�� ����(char)���� ó�� ��ü�� ��ȯ
			//byte -> char
			isr = new InputStreamReader(is);
			osw = new OutputStreamWriter(os);
			
			//���� �߰� : ����(buffer)������� ���ϰ� ���δ��� �����
			br = new BufferedReader(isr);
			pw = new PrintWriter(osw);
			
			//����Ÿ�� �ۼ��ؼ� ����
			Scanner scan = new Scanner(System.in);
			
			while (true) {
				//�޽��� �ۼ�
				System.out.print("�޽����Է�> ");
				String msg = scan.nextLine();
				
				//������ �޽��� ������ 
				pw.println("[Ŭ���̾�Ʈ]" + msg);
				pw.flush();
				
				//exit ���ڿ��� �Է��ؼ� �۾� ����
				if ("exit".equalsIgnoreCase(msg)) {
					break;
				}
				
				//�������� ������ �޽��� �޾Ƽ� ȭ�� ���
				String reMsg = br.readLine();
				System.out.println("from����> " + reMsg);
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
		
		System.out.println("---- Ŭ���̾�Ʈ ���� ----");
	}

}
