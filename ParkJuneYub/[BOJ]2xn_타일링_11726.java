import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 풀이법
// 1. 앞에서 부터 채우지 말고 앞은 이미가 채워져 있다고 생각하고 뒤에서 채우자
// 2. k-1 은 채워져 있고 1칸을 채울 방법, k-2는 채워져 있고 2칸을 채울 방법 ***** 
// 3. 메모리제이션을 활용해야 제한 시간안에 풀 수 있다.

public class Main {
	
	static int n;
	static int memo[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		memo = new int[n+1];
		
		Arrays.fill(memo, -1);
		
		memo[1] = 1;
		if(n >= 2) {
			memo[2] = 2;
		}

		for(int i = 3; i <= n; i++) {
			memo[i] = (memo[i-1] + memo[i-2]) % 10007;
		}
		
		System.out.println(memo[n]);
		
	}

}