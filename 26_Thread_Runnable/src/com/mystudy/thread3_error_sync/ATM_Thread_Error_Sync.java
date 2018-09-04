package com.mystudy.thread3_error_sync;

class ATM_Error_Sync implements Runnable {
	int money;
	
	ATM_Error_Sync() {}
	ATM_Error_Sync(int money) {
		this.money = money;
	}
	
	//�Ա�
	//synchronized ���� : �޼ҵ尡 ����Ǵ� ���� ����ȭ ó��
	//�ϳ��� �����尡 �޼ҵ带 ����ϰ� �ִ� ���� ������ ����
	//�ٸ� �����忡�� ����Ϸ��� �� ��� �����°� ��
	synchronized void add(int money) {
		this.money += money;
		System.out.println(Thread.currentThread()
				+ " �Ա�: " + money +", �ܾ�: " + this.money);
	}
	
	//���
	synchronized void out(int money) {
		this.money -= money;
		System.out.println(Thread.currentThread()
				+ " ���: " + money +", �ܾ�: " + this.money);
	}
	void bankSleep(int milisecond) {
		try {
			Thread.currentThread().sleep(milisecond);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		add(1000);
		bankSleep(500);
		out(500);
		bankSleep(500);
		out(300);
		bankSleep(500);
		out(200);
	}
}

public class ATM_Thread_Error_Sync {

	public static void main(String[] args) {
		System.out.println("--- main() ����");
		ATM_Error_Sync bank = new ATM_Error_Sync();
		System.out.println("�����ܰ�: " + bank.money);
		
		Thread thr1 = new Thread(bank, "ATM-1");
		Thread thr2 = new Thread(bank, "ATM-2");
		Thread thr3 = new Thread(bank, "ATM-3");
		
		thr1.start();
		thr2.start();
		thr3.start();

		System.out.println("--- main() ����");
	}

}








