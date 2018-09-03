package com.mystudy.am02_phone;

//////////////////////////
//��� ����(�޼ҵ���� ���� �˾Ƽ�)
//��ȭ�� �Ӽ� : Ÿ��(type), ��ȭ��ȣ(phoneNo)
//0. ��ȭ���� Ȯ��
//1. ��ȭ�ɱ�
//2. ��ȭ�ޱ�
//3. �޽��� ������
//4. �޽��� �ޱ�
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
	
	//�޼ҵ�(���) -------------------------------
	public void call() {
		System.out.println(">> ��ȭ�ɱ�");
	}
	public void receiveCall() {
		System.out.println(">> ��ȭ�ޱ�");
	}
	
	public void view() {
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "Phone [type=" + type + ", phoneNo=" + phoneNo + "]";
	}
	
	//�߰��޼ҵ� �ۼ�(�޽�������, �޽��� �ޱ�)
	public void sendMsg() {
		System.out.println(">> �޽��� ����");
	}
	public void receiveMsg() {
		System.out.println(">> �޽��� �ޱ�");
	}
}
