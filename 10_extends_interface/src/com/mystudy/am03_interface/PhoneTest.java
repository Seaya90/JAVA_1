package com.mystudy.am03_interface;

public class PhoneTest {

	public static void main(String[] args) {
		Phone ph = new Phone("Phone", "010-1111-1111");
		ph.sendMsg(); //메시지 보내기
		ph.receiveMsg(); //메시지 받기
	}
}
