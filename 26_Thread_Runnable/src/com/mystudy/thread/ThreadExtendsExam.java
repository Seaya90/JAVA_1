package com.mystudy.thread;

class ThreadParent {
	void print() {
		System.out.println("���� Thread Ŭ������ ParentŬ����");
	}
}
//�����带 ����� ���1
//Thread Ŭ������ ���(extends)�ؼ� ����ϴ� ���
class ThreadTest extends Thread {
	int num = 10;
	
	ThreadTest() {
	}
	ThreadTest(int num) {
		this.num = num;
	}
	
	@Override
	public void run() {
		//Thread Ŭ������ run() �޼ҵ带 �������̵��ؼ�
		//������� �Ϸ��� �۾��� �ۼ�
		System.out.println(">> run() ����");
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(">> run() ����");
	}
}

public class ThreadExtendsExam {

	public static void main(String[] args) {
		System.out.println("--- main() ���� ----");
		ThreadTest th1 = new ThreadTest();
		
		//th1.run(); //�ܼ� �޼ҵ�ȣ�� �ϻ� ������� �������� ����
		
		//������� ���۽�Ű���� ThreadŬ������ ������ start() �޼ҵ� ȣ��
		th1.start(); //������(Thread)�� ����
		
		//������ �ϳ� �� ����
		ThreadTest th2 = new ThreadTest(20);
		th2.start();
		
		System.out.println("--- main() ���� ----");
	}

}
