package study;

import java.util.Scanner;

public class BOJ_2979 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int[] arr = new int[100];
		int arrive, leave = 0;
		int max = 0;
		int min = 0;
		int sum = 0;
		
		for(int i = 0; i< 3; i++) {
			arrive = sc.nextInt();
			leave = sc.nextInt();
			min = Math.min(min, arrive);
			max = Math.max(max, leave);		
			
			// 트럭 한대의 시간동안 배열을 +1
			for(int j = arrive; j<leave; j++) {
				arr[j]++;
			}
			
		} // end of for(int i = 0; i< 3; i++)----------------
		
		// 가장 처음 시간부터 가장 마지막 시간까지 계산
		for(int i = min; i < max; i++) {
			
			switch (arr[i]) {
				case 1:
					sum = sum + A*arr[i];
					break;
					
				case 2:
					sum = sum + B*arr[i];
					break;
				case 3:
					sum = sum + C*arr[i];
					break;

			}
		} // end of for(int i = min; i < max; i++)--------------
		
		System.out.println(sum);
	}

}
