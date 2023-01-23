걸린 시간 : 80분
레벨 : 실버 4

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int cnt = 0;
	static Integer arr[] = new Integer[1000001]; 							// dp문제에서 메모리제이션 하는건 이해하겠음
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); 
		arr[0] = arr[1] = 0;
		dp(n);
		System.out.println(arr[n]);
		
	} // end of main --------------
	
	static int dp(int num) {
		
		if(arr[num] == null) {												// Integer 배열이기 때문에 비어있으면 진행
			if(num % 6 == 0) {												// 입력값이 6인 경우를 생각 못함
				arr[num] = Math.min(dp(num-1), Math.min( dp(num / 2), dp(num / 3) )) + 1;
			}
			
			else if(num % 3 == 0) {
				arr[num] = Math.min(dp(num / 3), dp(num-1)) + 1;
			}
			else if(num % 2 == 0) {
				arr[num] = Math.min(dp(num / 2), dp(num-1)) + 1;
			}
			
			else {
				arr[num] = dp(num-1)+1;
			}
		}
		
		return arr[num];
	}
	
	/*
	 public class Main {

	static int cnt = 0;
	static int dp[] = new int[1000001];
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());

		for(int i = 2; i<=n; i++) {									// 재귀함수가 아닌 반복문으로 접근하는 방식
			dp[i] = dp[i-1]+1;										// 바텀업 방식으로 n까지 계산하면서 배열을 채워나감
																	// 1. 먼저 -1을 하는 방식과, 2로 나누는 경우 또는 3으로 나누는 경우를 비교하여 배열 채움
			if(i % 3 == 0) {
				dp[i] = Math.min(dp[i], dp[i/3]+1);
			}
			if(i % 2 == 0) {
				dp[i] = Math.min(dp[i], dp[i/2]+1);					// 이 방식은 재귀함수와 다르게 6으로 나누는 경우를 생각하지 않아도 된다.
			}
		}
		
		System.out.println(dp[n]);
		
	} // end of main -------------- 
	 
	 * */

}