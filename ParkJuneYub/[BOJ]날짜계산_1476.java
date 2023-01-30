걸린 시간 : 8분
레벨 : 실버 5


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class Main {

	
	public static int ans = 1;
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int e = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int a = 1;
		int b = 1;
		int c = 1;
		
		while(true) {
			if(e == a && s == b && m == c) {
				System.out.print(ans);
				break;
			}
			a++;
			b++;
			c++;
			
			if(a > 15) a = 1;
			if(b > 28) b = 1;
			if(c > 19) c = 1;
			
			ans++;
		}
		
	}
	
}