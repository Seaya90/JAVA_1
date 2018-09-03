package com.mystudy.pm;

import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.jar.Attributes.Name;

import javax.xml.transform.stax.StAXResult;

public class StringControlExam {

	public static void main(String[] args) {
		/* ���ڿ� �ٷ��
		0.���ڿ� ������
		  String str1 = "ȫ�浿 �̼���   �̼��� Tom ȫ�浿"
		  String str2 = "     TOM    �������� ������ �����ҹ�"
		1. ���� ���ڿ��� StringBuilder ���� sb�� �̿��ؼ� �ϳ��� ���ڿ��� �����,
		2. sb�� ���ڿ��� ��ĭ(" ")�� �����ڷ� �߶�(�̸��� ����) ȭ�� ���
		   (String.split() �Ǵ� StringTokenizer ���)
		3. ������ �޸�(,)�� �����Ͽ� �Ѷ��ο� ���(StringBuilder ���)
		   (��¿�: ȫ�浿,�̼���,�̼���,Tom,ȫ�浿,TOM,��������,������,�����ҹ�)
		4. �������� ù���ڸ� �����ؼ� �޸�(,)�� �����Ͽ� �Ѷ��ο� ���(StringBuilder ���)
		   (��: ȫ,��,��,T,ȫ,T,��,��,��) 
		5. �迭�� ���ڿ��� �̸��� ���ڼ��� 4 �̻��� ���� "�ε�����ȣ:�̸�" ���
		       ��¿�: 
		   6:��������
		   8:�����ҹ�
		********************************/
		String str1 = "ȫ�浿 �̼���   �̼��� Tom ȫ�浿";
		String str2 = "     TOM    �������� ������ �����ҹ�";
		//"ȫ�浿 �̼���   �̼��� Tom ȫ�浿     TOM    �������� ������ �����ҹ�"
		//1. ���� ���ڿ��� StringBuilder ���� sb�� �̿��ؼ� �ϳ��� ���ڿ��� �����,
		StringBuilder sb = new StringBuilder();
		sb.append(str1).append(str2);
		System.out.println(sb.toString());
		
		//2. sb�� ���ڿ��� ��ĭ(" ")�� �����ڷ� �߶�(�̸��� ����) ȭ�� ���
		//   (String.split() �Ǵ� StringTokenizer ���)
		StringTokenizer stk = new StringTokenizer(sb.toString(), " ");
		
		//�߶� ����Ÿ�� �迭�� ����
		int tokenCnt = stk.countTokens();
		String[] names = new String[tokenCnt];
		
		//names <- stk ���� ����
		for (int i=0; i<tokenCnt; i++) {
			names[i] = stk.nextToken();
		}
		System.out.println(Arrays.toString(names));
		
		for (String name : names) {
			System.out.print(name + " ");
		}
		System.out.println();
		
		//3. ������ �޸�(,)�� �����Ͽ� �Ѷ��ο� ���(StringBuilder ���)
		//   (��¿�: ȫ�浿,�̼���,�̼���,Tom,ȫ�浿,TOM,��������,������,�����ҹ�)
		StringBuilder sbResult = new StringBuilder();
		
		System.out.println("���1 -----------------------");
		for (int i=0; i<names.length; i++) {
			//������ ����Ÿ��
			if (i == names.length - 1) {//���������� Ȯ��
				sbResult.append(names[i]);
			} else {
				sbResult.append(names[i]).append(",");
			}
		}
		System.out.println(sbResult.toString());
		
		System.out.println("���2 -----------------------");
		sbResult.setLength(0);
		boolean isFirst = true;
		for (String name : names) {
			if (isFirst) {//ù��° ����Ÿ ���� Ȯ��
				sbResult.append(name);
				isFirst = false;
			} else {
				sbResult.append(",").append(name);
			}
		}
		System.out.println(sbResult.toString());
		
		System.out.println("���3 -----------------------");
		sbResult.setLength(0);
		if (names.length > 0) {
			sbResult.append(names[0]); //ù��° ����Ÿ ó��
		}
		for (int i=1; i<names.length; i++) {//2��° ����Ÿ���� ó�� 
			sbResult.append(",").append(names[i]);
		}
		System.out.println(sbResult.toString());
		
		//----------------------------------
		//4. �������� ù���ڸ� �����ؼ� �޸�(,)�� �����Ͽ� �Ѷ��ο� ���(StringBuilder ���)
		//   (��: ȫ,��,��,T,ȫ,T,��,��,��) 
		sbResult.setLength(0);
		isFirst = true;
		for (String name : names) {
			if (isFirst) {
				sbResult.append(name.charAt(0)); //substring(0,1)
				isFirst = false;
			} else {
				sbResult.append(",").append(name.charAt(0));
			}
		}
		System.out.println(sbResult.toString());
		
		//------------------------------
		//5. �迭�� ���ڿ��� �̸��� ���ڼ��� 4 �̻��� ���� "�ε�����ȣ:�̸�" ���
		//   ��¿�: 
		//   6:��������
		//   8:�����ҹ�
		sbResult.setLength(0);
		int idx = 0;
		for (String str : names) {
			if (str.length() >= 4) {
				System.out.println(idx + ":" + str);
			}
			idx++;
		}
		
		
	}

}
