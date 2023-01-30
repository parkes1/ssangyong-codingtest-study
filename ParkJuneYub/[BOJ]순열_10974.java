걸린 시간 : 60분
레벨 : 실버 4

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	static int n;
	
	public static void permutation(int[] arr, int[] output, boolean[] visited, int nowDepth) {
		if(nowDepth == n) {
			for(int i = 0; i < n; i++) {
				System.out.print(output[i] + " ");
			}
			System.out.println("");
			return;
		}
		
		for(int i = 0; i < n; i++) {
			if(visited[i]) {
				output[nowDepth] = arr[i];
				visited[i] = false;
				permutation(arr, output, visited, nowDepth+1);
				visited[i] = true;
			}
			
		}
		
	}
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		
		int[] arr = new int[n];
		int[] output = new int[n];
		
		boolean[] visited = new boolean[n];
		Arrays.fill(visited, true);
		
		for(int i = 0; i < n; i++) {
			arr[i] = i+1;
		}
		
		permutation(arr, output, visited, 0);
	}
}
