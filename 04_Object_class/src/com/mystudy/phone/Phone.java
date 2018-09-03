package com.mystudy.phone;

//���������� : public, protected, (default), private
//Ŭ���� : public, (default)
//������ : Ŭ������ ���� ������ ������ ���
//�ʵ�, �޼ҵ� : public, protected, (default), private
class Phone {
	//�ʵ弱��(�Ӽ�)
	String name; //������ : null �ʱ�ȭ
	String type;
	
	int hsize; //int : 0 �ʱ�ȭ
	int vsize;
	boolean hasLCD;

	//������ ����
	Phone() {
		super(); //super: �θ�Ŭ����, �θ�Ŭ������ �⺻ ������ ȣ��
	} 
	Phone(String name, String type) {
		this.name = name; //this : ���� ��ü(instance)
		this.type = type;
	}
	Phone(String name, String type, boolean hasLCD) {
		this.name = name; //this : ���� ��ü(instance)
		this.type = type;
		this.hasLCD = hasLCD;
	}
	
	//�޼ҵ� ����
	void view() {
		System.out.println("=== ��ȭ�� ���� ===");
		System.out.println("�𵨸�: " + name);
		System.out.println("Ÿ��: " + type);
		System.out.println("����ũ��: " + hsize);
		System.out.println("����ũ��: " + vsize);
		System.out.println("LCD����: " + hasLCD);
	}
	
	void call() {
		System.out.println(">>��ȭ�ɱ�");
	}
	void receiveCall() {
		System.out.println(">>��ȭ�ޱ�");
	}
	
	void sendSms(String msg) {
		System.out.println("[�޽�������]" + msg);
	}
	
	String receiveSms(String msg) {
		System.out.println("[�޽�������]" + msg);
		return msg;
	}
		
}
