걸린 시간 : 47분
레벨 : 실버 1


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;



public class Main {

	static int n;
	static int[][] visited;
	static int[][] map;
	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {-1, 0, 1, 0};
	static int cnt = 0;
	static ArrayList<Integer> arr = new ArrayList<Integer>(); 
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		
		map = new int[n][n];
		visited = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			for(int j = 0; j < n; j++) {
				int num = (int)(str.charAt(j) - '0');
				map[i][j] = num;
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				
				if(map[i][j] == 1 && visited[i][j] == 0) {
					//System.out.println(j + " " + i + " dfs 시작");
					dfs(j, i);
					arr.add(cnt);
					//System.out.println(j + " " + i + " 시작으로 얻은 cnt" + cnt);
					cnt = 0;
				}
			}
		}
		
		System.out.println(arr.size());
		Collections.sort(arr);
		for(int i = 0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
	}
	
	public static void dfs(int x, int y) {
		visited[y][x] = 1;
		cnt++;
		
		//System.out.println(x + " " + y + " dfs 방문");
		for(int i=0; i<4; i++) {
			int newX = x+dx[i];
			int newY = y+dy[i];
			
			if(newX < 0 || newX >= n || newY < 0 || newY >= n) {
				continue;
			}
			
			if(visited[newY][newX] == 1 || map[newY][newX] == 0) {
				continue;
			}
			//System.out.println(newX + " " + newY + " dfs 방문 예정");
			dfs(newX, newY);
		}
	}
	

}