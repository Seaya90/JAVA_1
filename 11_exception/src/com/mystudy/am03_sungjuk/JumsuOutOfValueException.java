package com.mystudy.am03_sungjuk;

class JumsuOutOfValueException extends Exception {
	JumsuOutOfValueException() {
		super("점수범위(0~100)를 벗어난 값입니다.");
	}
}
