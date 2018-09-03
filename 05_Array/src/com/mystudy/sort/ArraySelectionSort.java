package com.mystudy.sort;

public class ArraySelectionSort {

	public static void main(String[] args) {
		//�迭�� ����� ���� ����(�������� : ASC)
		//30, 20, 50, 40, 10
		int[] num = {30, 20, 50, 40, 10};
		
		//����Ÿ Ȯ��
//		for (int i=0; i<num.length; i++) {
//			System.out.print(num[i] + " ");
//		}
//		System.out.println();
		printData(num);
		
		System.out.println("--- ���Ľ��� ---");
		//ù��° �� �������� �� �۾�(0�ε��� - 1�ε���)
		int temp;
/*		
		if (num[0] > num[1]) {
			temp = num[0];
			num[0] = num[1];
			num[1] = temp;
		}
		printData(num);
		
		//ù��° �� �������� �� �۾�(0�ε��� - 2�ε���)
		if (num[0] > num[2]) {
			temp = num[0];
			num[0] = num[2];
			num[2] = temp;
		}
		printData(num);
		
		if (num[0] > num[3]) {
			temp = num[0];
			num[0] = num[3];
			num[3] = temp;
		}
		printData(num);

		//ù��° �� �������� �� �۾�(0�ε��� - �Ǹ������ε���)
		if (num[0] > num[4]) { //�ε���: num.length-1
			temp = num[0];
			num[0] = num[4];
			num[4] = temp;
		}
		printData(num);
*/		
		
		//�ݺ������� ���� ó��
/*		
		//ù��° ���� �������� ����(�ε���: 0)
		for (int i=1; i<=4; i++) {
			if (num[0] > num[i]) { 
				temp = num[0];
				num[0] = num[i];
				num[i] = temp;
			}
		}
		printData(num);
		
		//2��° ���� �������� ����(�ε���: 1)
		//30, 20, 50, 40, 10
		for (int i=2; i<=4; i++) {
			if (num[1] > num[i]) { 
				temp = num[1];
				num[1] = num[i];
				num[i] = temp;
			}
		}
		printData(num);
		
		//3��° ���� �������� ����(�ε���: 2)
		//30, 20, 50, 40, 10
		for (int i=3; i<=4; i++) {
			if (num[2] > num[i]) { 
				temp = num[2];
				num[2] = num[i];
				num[i] = temp;
			}
		}
		printData(num);
		
		//4��° ���� �������� ����(�ε���: 3)
		//30, 20, 50, 40, 10
		for (int i=4; i<=4; i++) {
			if (num[3] > num[i]) { 
				temp = num[3];
				num[3] = num[i];
				num[i] = temp;
			}
		}
		printData(num);
*/
		printData(num);
		//�ݺ��� ó��
		System.out.println("--- ���� for������ ó�� ---");
/*		
		int baseIdx = 0;
		for (int destIdx = 1; destIdx <= 4; destIdx++) {
			for (int i=destIdx; i<=4; i++) {
				if (num[baseIdx] > num[i]) { 
					temp = num[baseIdx];
					num[baseIdx] = num[i];
					num[i] = temp;
				}
			}
			baseIdx++;
		}
		printData(num);
*/	
/*		
		//�ٱ��� ����for���� ����(0�ε���)���� �������ε��� ������
		int lastValue = num.length - 1; //�������ε���
		for (int gijun = 0; gijun < lastValue; gijun++) {
			//for���� ������ �����ε��� + 1 ������ �����ϰ� �������ε��� ����
			for (int i=gijun+1; i<num.length; i++) {
				if (num[gijun] > num[i]) { 
					temp = num[gijun];
					num[gijun] = num[i];
					num[i] = temp;
				}
			}
		}
		printData(num);
*/		
		/////////////////////////////////////////
		//�� ���� ��ġ���� Ȯ���ϰ� �������� �� ��ȯ �� ���� ����
		printData(num);
		
		System.out.println("--- ���� ���� ---");
		int lastValue = num.length - 1; //�������ε���
		int changeIdx; //������ ����� �Ǵ� �ε��� �� �����
		for (int gijun = 0; gijun < lastValue; gijun++) {
			changeIdx = gijun;
			//for���� ������ �����ε��� + 1 ������ �����ϰ� �������ε��� ����
			for (int i=gijun+1; i<num.length; i++) {
				//0, 1
				if (num[changeIdx] > num[i]) { 
					changeIdx = i;
				}
			}
			//���ذ��� ���� �ε����� ��ġ���� ��ȯ
			if (gijun != changeIdx) {
				System.out.println(gijun + " <-> " + changeIdx);
				temp = num[gijun];
				num[gijun] = num[changeIdx];
				num[changeIdx] = temp;
			}
			
			printData(num);
		}
	}
	
	static void printData(int[] num) {
		for (int i=0; i<num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}

}
