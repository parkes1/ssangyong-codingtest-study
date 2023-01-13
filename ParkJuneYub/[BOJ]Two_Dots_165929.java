걸린 시간 : 88분
레벨 : 골드 4

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	

	static int n, m;
	static char[][] arr;
	static int[][] visited;
	static int[] Xposition = {0,1,0,-1}; // 상 우 하 좌, 시계방향
	static int[] Yposition = {-1,0,1,0};
	static boolean findCycle = false;
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new char[n][m];
		visited = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			
			String tmp = br.readLine();
			
			for(int j = 0; j < m; j++) {
				
				arr[i][j] = tmp.charAt(j);
				visited[i][j] = 0;
			}
		}
		// x = j , y = i
		outer:
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				dfs(j,i, arr[i][j], 0, j, i);
				if(findCycle) {
					System.out.println("Yes");
					break outer;
				}
			}
		}
		if(!findCycle) {
			System.out.println("No");
		}
		
	}
	
	public static void dfs(int startX, int startY, char color, int cnt, int visitX, int visitY) {
		
		visited[visitY][visitX] = 1;
		
		// 노드 방문
		for(int k = 0; k < 4; k++) {
			int X = visitX+Xposition[k];
			int Y = visitY+Yposition[k];
			
			if(cnt >=4 && startX == X && startY == Y) {
				findCycle = true;
				return;
			}
			
			if(X < 0 || X >= m || Y < 0 || Y >= n) {
				continue;
			}
				
			if(color == arr[Y][X] && visited[Y][X] != 1) {
				dfs(startX, startY, color, ++cnt, X, Y);
			}
		}
		visited[visitY][visitX] = 0;
		
	}
}
