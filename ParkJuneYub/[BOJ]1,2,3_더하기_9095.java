걸린 시간 : 30분
레벨 : 실버 3

test

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;



public class Main {

	// 올바른 방법은 아니다. 다이나믹 프로그래밍을 진행할 때는 연산속도 개선을 위해 메모리제이션을 활용해야 하느데
	// 이번 방법은 재귀함수만을 활용해서 풀었다. 그러다 보니 다른 사람들에 비해 시간이 더 오래 걸렸다.
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			sb.append(function(num)).append("\n");
		}
		
		System.out.println(sb);
	}

	private static int function(int num) {
		int cnt = 0;
		
		if(num == 0){
			return 1;
		}
		
		if(num >= 1) {
			cnt += function(num-1);
		}
		
		if(num >= 2) {
			cnt += function(num-2);
		}
		
		if(num >= 3) {
			cnt += function(num-3);
		}
		
		return cnt;
	}
}