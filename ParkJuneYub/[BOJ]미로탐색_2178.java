걸린 시간 : 70분
레벨 : 실버 1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	static int n, m;
	static int ans = 0;
	static int[][] map;
	static int[] Xmove = {-1, 0, 1, 0};
	static int[] Ymove = {0, 1, 0, -1}; // 12 3 6 9 시계방향
	static boolean[][] visited;
	
	public static int dfs(int x, int y, int cnt) {
		if(x != n-1 || y != m-1) {
			
			int ans = 10000;
			
			for(int i = 0; i < 4; i++) {
				int newX = x + Xmove[i];
				int newY = y + Ymove[i];
				
				if(isRange(newX, newY) && map[newX][newY] == 1 && visited[newX][newY]) {
					visited[newX][newY] = false;
					ans = Math.min(ans, dfs(newX, newY, cnt+1));
					visited[newX][newY] = true;
				}
			}
			cnt = ans;
		}
		
		return cnt;
	}
	
	public static boolean isRange(int x, int y) {
		if(0 > x || x >= n || 0 > y || y >= m) return false;
		
		return true;
	}
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		map = new int[n][m];
		visited = new boolean[n][m];
		

		
		for(int i = 0; i < n; i++) {
			
			String str = br.readLine();
			
			for(int j = 0; j < m; j++) {
				
				map[i][j] = (int)(str.charAt(j)) - '0';
				visited[i][j] = true;
			}
		}
		

		
		visited[0][0] = false;
		System.out.println(dfs(0, 0, 1));
		
	}
}

