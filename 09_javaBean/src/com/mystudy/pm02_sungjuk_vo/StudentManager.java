package com.mystudy.pm02_sungjuk_vo;

public class StudentManager {

	public static void main(String[] args) {
		StudentVO stu1 = new StudentVO("ȫ�浿",100,90,80);
		System.out.println(stu1);
		stu1.printData();
		stu1.setMath(81);
		System.out.println("========");
		stu1.printData();
		System.out.println("-----");
		String str = stu1.getData();
		System.out.println(">>");
		System.out.println(stu1.getData());
		System.out.println(str);
		
		System.out.println("-----------------");
		StudentVO stu2 = new StudentVO("�̼���",99,88,77);
		stu2.printData(); //�̼���
		stu1.printData(); //ȫ�浿
		
		StudentVO stu3 = new StudentVO("������",90,80,70);
		stu3.printData();
		
		StudentVO[] stuArr = new StudentVO[3];
		stuArr[0] = stu1;
		stuArr[1] = stu2;
		stuArr[2] = stu3;
		
		//----------------
		System.out.println("====== �迭���� ���� ���� ========");
		stuArr[0].printData();
		stuArr[1].printData();
		stuArr[2].printData();

	}
	
	static void printData(StudentVO[] stus) {
		//���޹��� �迭 ���� �̾Ƽ� ���������� ���
	}

}
