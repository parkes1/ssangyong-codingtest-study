걸린 시간 : 20분
레벨 : 실버 3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static int n;
	public static int[] t;
	public static int[] p;
	
	public static int work(int day, int reward) {
		if(day == n) {             // 초기값 설정 -> 함수의 끝을 만든다.
			return reward;
		}
		if(day > n) {
			return -10000;          // 7일 초과 꽝
		}
		reward = Math.max(work(t[day] + day, reward+p[day]), work(day+1, reward));
		return reward;
	}
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		t = new int[n];
		p = new int[n];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			t[i] = Integer.parseInt(st.nextToken());
			p[i] = Integer.parseInt(st.nextToken());
		}
		
		int ans = work(0, 0);
		System.out.println(ans);
	}
}