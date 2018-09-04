package com.mystudy.thread2_runnable;

class ThreadParent {
	void print() {
		System.out.println("나는 Thread 클래스의 Parent클래스");
	}
}


//쓰레드(Thread)로 동작하는 클래스 만드는 방법2
//Runnable 인터페이스를 구현(implements)하는 방식으로 만들기
class ThreadImpl extends ThreadParent implements Runnable {

	@Override
	public void run() {
		super.print();
		System.out.println("ThreadImpl.run() : Runnable 인터페이스 구현부");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
	
}

public class ThreadImplRunnable {

	public static void main(String[] args) {
		System.out.println("---- main() 시작 ----");
		Thread thMain = Thread.currentThread();
		System.out.println(thMain.toString());
		
		//Runnable 인터페이스를 구현한 객체를 쓰레드로 사용하기 위해서는
		//Thread 클래스의 생성자에 Runnable 구현객체를 전달해서 
		//쓰레드 객체 생성
		ThreadImpl thrImpl = new ThreadImpl();
		
		Thread th = new Thread(thrImpl); //new Thread(Runnable 객체)
		
		th.start(); //쓰레드로 동작시킴
				

		System.out.println("---- main() 종료 ----");
	}

}






