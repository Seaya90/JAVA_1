
public class Ex12_while_ex {

	public static void main(String[] args) {
		//while문을 사용해서 처리
		//문제1 : 1~10까지의 합계(sum) 구하고 출력
		int num = 1;
		int sum = 0;
		while (num <= 10) {
			System.out.println(num);
			sum = sum + num;
			num++;
		}
		System.out.println("1~10합계: " + sum);
		
		//문제2 
		/* 삼각형 그리기
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
		int line = 1; //(바깥쪽)초기값 설정
		while (line <= 5) { //(바깥쪽)조건식
			starCnt = 1; //(안쪽)초기값 설정
			while (starCnt <= line) { //(안쪽)조건식
				System.out.print("*");
				starCnt++; //(안쪽)증감식
			}
			System.out.println();
			
			line++; //(바깥쪽)증감식
		}
	}

}
