package com.mystudy.sort;

public class ArraySelectionSort {

	public static void main(String[] args) {
		//배열에 저장된 숫자 정렬(오름차순 : ASC)
		//30, 20, 50, 40, 10
		int[] num = {30, 20, 50, 40, 10};
		
		//데이타 확인
//		for (int i=0; i<num.length; i++) {
//			System.out.print(num[i] + " ");
//		}
//		System.out.println();
		printData(num);
		
		System.out.println("--- 정렬시작 ---");
		//첫번째 값 기준으로 비교 작업(0인덱스 - 1인덱스)
		int temp;
/*		
		if (num[0] > num[1]) {
			temp = num[0];
			num[0] = num[1];
			num[1] = temp;
		}
		printData(num);
		
		//첫번째 값 기준으로 비교 작업(0인덱스 - 2인덱스)
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

		//첫번째 값 기준으로 비교 작업(0인덱스 - 맨마지막인덱스)
		if (num[0] > num[4]) { //인덱스: num.length-1
			temp = num[0];
			num[0] = num[4];
			num[4] = temp;
		}
		printData(num);
*/		
		
		//반복문으로 변경 처리
/*		
		//첫번째 값을 기준으로 정렬(인덱스: 0)
		for (int i=1; i<=4; i++) {
			if (num[0] > num[i]) { 
				temp = num[0];
				num[0] = num[i];
				num[i] = temp;
			}
		}
		printData(num);
		
		//2번째 값을 기준으로 정렬(인덱스: 1)
		//30, 20, 50, 40, 10
		for (int i=2; i<=4; i++) {
			if (num[1] > num[i]) { 
				temp = num[1];
				num[1] = num[i];
				num[i] = temp;
			}
		}
		printData(num);
		
		//3번째 값을 기준으로 정렬(인덱스: 2)
		//30, 20, 50, 40, 10
		for (int i=3; i<=4; i++) {
			if (num[2] > num[i]) { 
				temp = num[2];
				num[2] = num[i];
				num[i] = temp;
			}
		}
		printData(num);
		
		//4번째 값을 기준으로 정렬(인덱스: 3)
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
		//반복문 처리
		System.out.println("--- 이중 for문으로 처리 ---");
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
		//바깥쪽 기준for문은 시작(0인덱스)부터 마지막인덱스 전까지
		int lastValue = num.length - 1; //마지막인덱스
		for (int gijun = 0; gijun < lastValue; gijun++) {
			//for문의 시작은 기준인덱스 + 1 값으로 시작하고 마지막인덱스 까지
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
		//값 비교후 위치값만 확인하고 마지막에 값 교환 한 번만 실행
		printData(num);
		
		System.out.println("--- 정렬 시작 ---");
		int lastValue = num.length - 1; //마지막인덱스
		int changeIdx; //변경할 대상이 되는 인덱스 값 저장용
		for (int gijun = 0; gijun < lastValue; gijun++) {
			changeIdx = gijun;
			//for문의 시작은 기준인덱스 + 1 값으로 시작하고 마지막인덱스 까지
			for (int i=gijun+1; i<num.length; i++) {
				//0, 1
				if (num[changeIdx] > num[i]) { 
					changeIdx = i;
				}
			}
			//기준값과 최종 인덱스된 위치값과 교환
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
