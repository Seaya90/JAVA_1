package com.mystudy.am02_myexception;

//���ܸ���� : Exception Ŭ������ ��� �޾Ƽ� �����
class MyException extends Exception {
	MyException() {
		super(">>���� ���� Exception"); //�θ�Ŭ������ ������ ȣ��(���ܸ޽���)
	}
	
	MyException(String msg) {
		super(">>���� ���� Exception: " + msg);
	}
}
