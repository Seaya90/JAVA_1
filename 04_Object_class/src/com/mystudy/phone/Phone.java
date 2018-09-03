package com.mystudy.phone;

//접근제한자 : public, protected, (default), private
//클래스 : public, (default)
//생성자 : 클래스와 같은 범위의 제한자 사용
//필드, 메소드 : public, protected, (default), private
class Phone {
	//필드선언(속성)
	String name; //참조형 : null 초기화
	String type;
	
	int hsize; //int : 0 초기화
	int vsize;
	boolean hasLCD;

	//생성자 선언
	Phone() {
		super(); //super: 부모클래스, 부모클래스의 기본 생성자 호출
	} 
	Phone(String name, String type) {
		this.name = name; //this : 현재 객체(instance)
		this.type = type;
	}
	Phone(String name, String type, boolean hasLCD) {
		this.name = name; //this : 현재 객체(instance)
		this.type = type;
		this.hasLCD = hasLCD;
	}
	
	//메소드 선언
	void view() {
		System.out.println("=== 전화기 정보 ===");
		System.out.println("모델명: " + name);
		System.out.println("타입: " + type);
		System.out.println("가로크기: " + hsize);
		System.out.println("세로크기: " + vsize);
		System.out.println("LCD유무: " + hasLCD);
	}
	
	void call() {
		System.out.println(">>전화걸기");
	}
	void receiveCall() {
		System.out.println(">>전화받기");
	}
	
	void sendSms(String msg) {
		System.out.println("[메시지전송]" + msg);
	}
	
	String receiveSms(String msg) {
		System.out.println("[메시지수신]" + msg);
		return msg;
	}
		
}
