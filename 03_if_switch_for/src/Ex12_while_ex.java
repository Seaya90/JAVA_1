
public class Ex12_while_ex {

	public static void main(String[] args) {
		//while���� ����ؼ� ó��
		//����1 : 1~10������ �հ�(sum) ���ϰ� ���
		int num = 1;
		int sum = 0;
		while (num <= 10) {
			System.out.println(num);
			sum = sum + num;
			num++;
		}
		System.out.println("1~10�հ�: " + sum);
		
		//����2 
		/* �ﰢ�� �׸���
		 * 
		 **
		 ***
		 ****
		 *****
		*/
		System.out.println("-------------");
		int starCnt;
		
		starCnt = 1;
		while (starCnt <= 1) {
			System.out.print("*");
			starCnt++;
		}
		System.out.println();
		
		starCnt = 1;
		while (starCnt <= 2) {
			System.out.print("*");
			starCnt++;
		}
		System.out.println();
		
		starCnt = 1;
		while (starCnt <= 3) {
			System.out.print("*");
			starCnt++;
		}
		System.out.println();

		System.out.println("======================");
		int line = 1; //(�ٱ���)�ʱⰪ ����
		while (line <= 5) { //(�ٱ���)���ǽ�
			starCnt = 1; //(����)�ʱⰪ ����
			while (starCnt <= line) { //(����)���ǽ�
				System.out.print("*");
				starCnt++; //(����)������
			}
			System.out.println();
			
			line++; //(�ٱ���)������
		}
	}

}
