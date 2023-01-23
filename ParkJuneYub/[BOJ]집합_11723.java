걸린 시간 : 46분
레벨 : 실버 5

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class Main {

	
	public static int S = 0;
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int m = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			String msg = st.nextToken();
			
			switch (msg) {
				case "add": {
					int num = Integer.parseInt(st.nextToken());
					S = S | (1 << num);
					break;
				}
				
				case "remove": {
					int num = Integer.parseInt(st.nextToken());
					S = S & ~(1 << num);
					break;
				}
				
				case "check": {
					int num = Integer.parseInt(st.nextToken());
					if((S & (1 << num)) == (1 << num)) {
						sb.append(1).append('\n');
					} else {
						sb.append(0).append('\n');
					}
					break;
				}
				
				case "toggle": {
					int num = Integer.parseInt(st.nextToken());
					S = S ^ (1 << num);
					break;
				}
				
				case "all" : {
					S = (1 << 21)-1;
					break;
				}
				
				case "empty" : {
					S = 0;
					break;
				}
			}
		}
		System.out.println(sb);
	}
	
}