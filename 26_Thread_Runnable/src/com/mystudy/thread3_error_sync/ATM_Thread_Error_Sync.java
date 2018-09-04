package com.mystudy.thread3_error_sync;

class ATM_Error_Sync implements Runnable {
	int money;
	
	ATM_Error_Sync() {}
	ATM_Error_Sync(int money) {
		this.money = money;
	}
	
	//입금
	//synchronized 적용 : 메소드가 실행되는 동안 동기화 처리
	//하나의 쓰레드가 메소드를 사용하고 있는 동안 실행을 보장
	//다른 쓰레드에서 사용하려고 할 경우 대기상태가 됨
	synchronized void add(int money) {
		this.money += money;
		System.out.println(Thread.currentThread()
				+ " 입금: " + money +", 잔액: " + this.money);
	}
	
	//출금
	synchronized void out(int money) {
		this.money -= money;
		System.out.println(Thread.currentThread()
				+ " 출금: " + money +", 잔액: " + this.money);
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
		System.out.println("--- main() 시작");
		ATM_Error_Sync bank = new ATM_Error_Sync();
		System.out.println("은행잔고: " + bank.money);
		
		Thread thr1 = new Thread(bank, "ATM-1");
		Thread thr2 = new Thread(bank, "ATM-2");
		Thread thr3 = new Thread(bank, "ATM-3");
		
		thr1.start();
		thr2.start();
		thr3.start();

		System.out.println("--- main() 종료");
	}

}








