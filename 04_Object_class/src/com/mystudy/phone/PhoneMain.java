package com.mystudy.phone;

class PhoneMain {

	public static void main(String[] args) {
		Phone phone1 = new Phone(); 
		phone1.view();
		
		Phone phone2 = new Phone("������8", "����Ʈ��");
		phone2.hsize = 10;
		phone2.vsize = 20;
		phone2.hasLCD = true;
		phone2.view();
		
		Phone phone3 = new Phone("������", "����Ʈ��", true);
		phone3.view();
		phone3.call();
		phone3.receiveCall();
		phone3.sendSms("�ȳ��ϼ���~~~");
		
		phone3.receiveSms("�ݰ����ϴ�");
		String msg = phone3.receiveSms("�ݰ����ϴ�");
		System.out.println("�����޽���: " + msg);
	}

}
