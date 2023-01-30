걸린 시간 : 9분
레벨 : 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	static int[] memo;
	static int cnt = 0;
	static final int MOD = 10007;
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		memo = new int[1001];
		Arrays.fill(memo, -1);
		
		memo[1] = 1;
		memo[2] = 2;
		
		for(int i = 3; i<=n; i++) {
			memo[i] = (memo[i-1] + memo[i-2])%MOD;
		}
		
		System.out.println(memo[n]);
		
	}

}