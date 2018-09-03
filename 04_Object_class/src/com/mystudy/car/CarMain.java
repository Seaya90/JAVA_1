package com.mystudy.car;

public class CarMain {

	public static void main(String[] args) {
		//Car 클래스를 이용하여 객체생성
		Car car1 = new Car();
		System.out.println("자동차이름: " + car1.name);
		System.out.println("모델명: " + car1.model);
		System.out.println("색상: " + car1.color);
		System.out.println("차량길이: " + car1.CAR_LENGTH);
		System.out.println("차량너비: " + car1.CAR_WIDTH);
		System.out.println("에어백: " + car1.existAirbag);
		
		System.out.println("----");
		car1.name = "처음가져본 차";
		System.out.println("자동차이름: " + car1.name);
		car1.existAirbag = true;
		System.out.println("에어백: " + car1.existAirbag);
		
		System.out.println("--- 기능 작동 -------------");
		car1.run();
		car1.stop();
		car1.back();
		
		System.out.println("===== car2 ==========");
		Car car2 = new Car("패밀리카", "소나타", "검정");
		System.out.println("자동차이름: " + car2.name);
		System.out.println("모델명: " + car2.model);
		System.out.println("색상: " + car2.color);
		System.out.println("차량길이: " + car2.CAR_LENGTH);
		System.out.println("차량너비: " + car2.CAR_WIDTH);
		System.out.println("에어백: " + car2.existAirbag);
		
		System.out.println("--- 기능 작동 -------------");
		car2.run();
		car2.stop();
		car2.back();
		
		//final 변수값 변경 시도
		//car2.CAR_LENGTH = 400; //상수처리되기 때문에 변경 못함
		
		System.out.println(car2);
		System.out.println("===========================");
		car2.dispData();
		
	}

}
