package com.mystudy.pm01_map_sungjuk;

import java.util.HashMap;

public class SungjukTest {

	public static void main(String[] args) {
		//1. HashMap<String, Integer> Ÿ���� ���� sungjuk�� �����ϰ�
		//2. map�� �̸�:���� ������ �Ʒ��� ����Ÿ�� �Է�
		//   "ȫ�浿:100, ������:90, ��������:95, ���:87, ������:92"
		//3. �Էµ� ����Ÿ�� ��ȸ�ؼ� ������ ������ tot�� ����
		//4. ����(tot)�� ���� �ο� ���� ���� ��� ���� avg�� ����
		//5. ����Ͻÿ�.
		//   ����  ����
		//   -----------
		//   ȫ�浿: 100
		//   ������: 90
		//   ...
		//   ������: 92
		//   ==========
		//   ����: ???
		//   ���: ???
		////////////////////////////////////////////
		
		HashMapSungjukExam exam = new HashMapSungjukExam();
		exam.sungjuk = new HashMap<String, Integer>();
		exam.inputData();
		exam.displayData();
		exam.computeAvg();
		exam.computeTot();
//		System.out.println("����: " + exam.tot);
//		System.out.println("���: " + exam.avg);
		System.out.println();
		exam.printData();
		
	}

}
