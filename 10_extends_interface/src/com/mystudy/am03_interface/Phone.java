package com.mystudy.am03_interface;

//인터페이스를 구현(implements)
//I_Phone 인터페이스를 사용해서 Phone 클래스를 구현
//0. 전화정보 확인
//1. 전화걸기
//2. 전화받기
//3. 메시지 보내기
//4. 메시지 받기
class Phone implements I_Phone {
	private String type;
	private String phoneNo;
	
	public Phone() {}
	public Phone(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Phone(String type, String phoneNo) {
		this.type = type;
		this.phoneNo = phoneNo;
	}
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	@Override
	public String toString() {
		return "Phone [type=" + type + ", phoneNo=" + phoneNo + "]";
	}
	//---------------------------------------
	//인터페이스 정의 메소드 구현부
	@Override
	public void view() {
		System.out.println(super.toString());
	}

	@Override
	public void call() {
		System.out.println(">> 전화걸기");
	}

	@Override
	public void receiveCall() {
		System.out.println(">> 전화받기");
	}

	@Override
	public void sendMsg() {
		System.out.println(">> 메시지 전송");
	}

	@Override
	public void receiveMsg() {
		System.out.println(">> 메시지 수신");
	}

}
