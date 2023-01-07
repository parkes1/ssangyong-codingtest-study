걸린 시간 : 26분
레벨 : 실버 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int k;
	static int[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;


		
		while(true) { // k이 0이 나올 때까지 반복
			st = new StringTokenizer(br.readLine());
			k = Integer.parseInt(st.nextToken());
			if (k == 0) {
				break;
			}
			
			arr = new int[k];
			
			for(int i = 0; i < k; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			for(int a = 0; a <= arr.length-6; a++) {
				for(int b = a+1; b <= arr.length-5; b++) {
					for(int c = b+1; c <= arr.length-4; c++) {
						for(int d = c+1; d <= arr.length-3; d++) {
							for(int e = d+1; e <= arr.length-2; e++) {
								for(int f = e+1; f <= arr.length-1; f++) {
									System.out.println(arr[a] + " " + arr[b] + " " + arr[c] + " " + arr[d] + " "
											+ arr[e] + " " + arr[f]);
								}
							}
						}
					}
				}
			}
			System.out.println("");
		}
		
	}

}