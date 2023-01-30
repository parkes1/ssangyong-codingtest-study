걸린 시간 : 17분
레벨 : 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;



public class Main {

	static int[] memo;
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		memo = new int[46];
		Arrays.fill(memo, -1);
		
		
		memo[1] = 1;
		memo[2] = 1;
		for(int i = 3; i<=n; i++) {
			memo[i] = memo[i-1] + memo[i-2];	
		}
	
		
		System.out.println(memo[n]);
	}

}

