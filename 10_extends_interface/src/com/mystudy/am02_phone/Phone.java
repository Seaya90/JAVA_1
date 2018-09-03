package com.mystudy.am02_phone;

//////////////////////////
//기능 구현(메소드명은 각자 알아서)
//전화기 속성 : 타입(type), 전화번호(phoneNo)
//0. 전화정보 확인
//1. 전화걸기
//2. 전화받기
//3. 메시지 보내기
//4. 메시지 받기
public class Phone {
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
	
	//메소드(기능) -------------------------------
	public void call() {
		System.out.println(">> 전화걸기");
	}
	public void receiveCall() {
		System.out.println(">> 전화받기");
	}
	
	public void view() {
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "Phone [type=" + type + ", phoneNo=" + phoneNo + "]";
	}
	
	//추가메소드 작성(메시지전송, 메시지 받기)
	public void sendMsg() {
		System.out.println(">> 메시지 전송");
	}
	public void receiveMsg() {
		System.out.println(">> 메시지 받기");
	}
}
