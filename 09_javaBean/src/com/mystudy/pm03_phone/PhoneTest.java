package com.mystudy.pm03_phone;

public class PhoneTest {

	public static void main(String[] args) {
		//Phone, Mp3Phone °´Ã¼ »ý¼º ÈÄ ±â´É Å×½ºÆ®
		System.out.println("=== Phone ===");
		Phone ph1 = new Phone("010-1111-1111");
		ph1.view();
		ph1.call();
		ph1.receiveCall();

		Phone ph2 = new Phone("»ï¼º°¶·°½Ã", "010-2222-2222");
		ph2.view();
		ph2.call();
		ph2.receiveCall();
		
		System.out.println("=== Mp3Phone ===");
		Mp3Phone mp3ph = new Mp3Phone("010-3333-3333");
		mp3ph.view();
		mp3ph.call();
		mp3ph.receiveCall();
		mp3ph.playMusic();
	}
}








