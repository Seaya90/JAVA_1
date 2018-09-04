package com.mystudy.thread3_error;

class ATM_Error implements Runnable {
	int money;
	
	ATM_Error() {}
	ATM_Error(int money) {
		this.money = money;
	}
	
	//�Ա�
	void add(int money) {
		this.money += money;
		System.out.println(Thread.currentThread()
				+ " �Ա�: " + money +", �ܾ�: " + this.money);
	}
	
	//���
	void out(int money) {
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

public class ATM_Thread_Error {

	public static void main(String[] args) {
		System.out.println("--- main() ����");
		ATM_Error bank = new ATM_Error();
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








