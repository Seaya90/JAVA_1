package com.mystudy.pm03_phone;

public class Phone {
	//��ȣ�� ���� ������ ǥ��
	//+: public, #: protected, -: private, (default) ����
	//-type: String
	//-phoneNo: String
	private String type;
	private String phoneNo;
	
	//������(phoneNo) : type�� "Phone Ÿ��" �Է�ó��
	//������(type, phoneNo)
	public Phone(String phoneNo) {
		type = "Phone Ÿ��";
		this.phoneNo = phoneNo;
	}

	public Phone(String type, String phoneNo) {
		super();
		this.type = type;
		this.phoneNo = phoneNo;
	}

	//getType
	//getPhoneNo
	public String getType() {
		return type;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	
	
	//call() : ">> ��ȭ�ɱ�" ȭ�����
	//receiveCall() : ">> ��ȭ�ޱ�" ȭ�����
	public void call() {
		System.out.println(">> ��ȭ�ɱ�");
	}
	public void receiveCall() {
		System.out.println(">> ��ȭ�ޱ�");
	}
	
	//view() : toString() ȣ��
	public void view() {
		System.out.println(toString());
	}
	
	//toString() : ��Ŭ�������� �ڵ� ����
	@Override
	public String toString() {
		return "Phone [type=" + type + ", phoneNo=" + phoneNo + "]";
	}
	
}