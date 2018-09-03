package com.mystudy.am03_interface;

//class Mp3Phone implements I_Phone, I_Mp3Phone {
class Mp3Phone extends Phone implements I_Mp3Phone {

	@Override
	public void playMusic() {
		System.out.println(">> 음악플레이");
	}
}
