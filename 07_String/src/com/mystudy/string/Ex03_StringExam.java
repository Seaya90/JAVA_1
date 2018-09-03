package com.mystudy.string;

public class Ex03_StringExam {

	public static void main(String[] args) {
		/* ���ڿ� �ֹι�ȣ ó�� 
		String str = "900108-1234567"; //�ֹι�ȣ
		����1. ��Ȯ�� �Է��� �� ����Ÿ ���� Ȯ��
		     (��ü�ڸ��� 14, '-' ��ġ: 7��°)  
		����4. ����Ÿ �� ����
		      (��: 1~12, ��: 1~31)
		����2. ������� ���
		����3. ����Ȯ���ϰ� ���(1,3: ����, 2,4: ����)
		���� : int num = Integer.parseInt("12"); //"12" -> 12
		*/
		String str = "900108-2234567";
		
		//����1.��Ȯ�� �Է��� �� ����Ÿ ���� Ȯ��(��ü�ڸ��� 14, '-' ��ġ: 7��°)
		//1-1 �Էµ� �ֹι�ȣ�� ���ڿ� ���̰� 14���� �� Ȯ��(if�� ���)
		int strLen = str.length();
		//if (str.length() == 14) {
		if (strLen == 14) {
			System.out.println("[����] �ֹι�ȣ ũ�� " + strLen + "�ڸ�");
		} else {
			System.out.println("[���ܹ߻�] �ֹι�ȣ�� " + strLen +"�ڸ��� �ԷµǾ����ϴ�.");
			System.out.println("�ֹι�ȣ�� 14�ڸ�(��: 901108-1234567)�� �Է��ؾ��մϴ�.");
		}
		
		//1-2 �ֹι�ȣ ���ڿ����� '-'�� ��ġ�� 7��° ���� �� Ȯ��(if�� ���)
		//System.out.println(str.indexOf("-"));
		int barLoc = str.indexOf("-") + 1; //�ε��� + 1
		//if (barLoc != 7) {
		if (str.indexOf("-") + 1 != 7  ) {
			System.out.println("[���ܹ߻�] ���� '-'�� 7��° ��ġ�� �ƴմϴ�. Ȯ���ϼ���");
		} else {
			System.out.println("[����] ���� '-'�� 7��°�� ���� �ԷµǾ����ϴ�.");
		}
		
		//-------------------------------
		//����4. ����Ÿ �� ����(��: 1~12, ��: 1~31)
		//4-1 �ֹι�ȣ�� 3~4��° ���� �� �����ϰ� 1~12 ������ ������ Ȯ��(if�� ���)
		//System.out.println(str.substring(2, 4));
		//String month = str.substring(2, 4); //"01"
		int mm = Integer.parseInt(str.substring(2, 4));
		
		if (mm >= 1 && mm <= 12) {
			System.out.println("[����] ������ 1~12�� ������ ���� �Է�");
		} else {
			System.out.println("[���ܹ߻�] ������ 1~12 ���� �ƴմϴ�.");
		}
		
		//4-2 �ֹι�ȣ�� 5~6��° ���� �� �����ϰ� 1~31 ������ ������ Ȯ��(if�� ���)
		int dd = Integer.parseInt(str.substring(4, 6));
		
		if (dd >= 1 && dd <= 31) {
			System.out.println("[����] ���ڰ� 1~31�� ������ ���� �Է�");
		} else {
			System.out.println("[���ܹ߻�] ���ڰ� 1~31 ���� �ƴմϴ�.");
		}
		
		//---------------------------------
		//����2. ������� ���(00�� 00�� 00��)
		//2-1 ���� �� ���� 
		String sYY = str.substring(0, 2);
		//2-2 ���� �� ����
		String sMM = str.substring(2, 4);
		//2-3 ���� �� ����
		String sDD = str.substring(4, 6);
		
		//2-4 ������� ��� (00�� 00�� 00�� ���) 90�� 01�� 08��
		String yymmdd = sYY + "�� " + sMM +"�� "+ sDD +"��"; 
		System.out.println("�������: " + yymmdd);
		
		//------------------------------
		//����3. ����Ȯ���ϰ� ���(1,3: ����, 2,4: ����)
		//3-1 �ֹι�ȣ���� '-' ������ ���ڸ� �����ϰ�(8��° ��ġ)
//		System.out.println(str.charAt(7));
//		System.out.println(str.charAt(str.indexOf("-") + 1));
		char gender = str.charAt(7);
		
		//3-2 ���� ���� ���� �� �� ��� (1,3: ����, 2,4: ����)
		if (gender == '1' || gender == '3') {
			System.out.println("���� : ����");
		} else if (gender == '2' || gender == '4' ) {
			System.out.println("���� : ����");
		} else {
			System.out.println("[���ܹ߻�] �������� 1~4�� �ƴմϴ�");
		}
	}

}
