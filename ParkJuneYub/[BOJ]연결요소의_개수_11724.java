걸린 시간 : 80분
레벨 : 실버 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class Main {

	static int v;
	static int e;
	static int[][] graph;
	static int[] visited;
	static int cnt = 0; 
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		v = Integer.parseInt(st.nextToken());
		e = Integer.parseInt(st.nextToken());
		graph = new int[v+1][v+1];
		visited = new int[v+1];
		
		int row;
		int col;
		
		for(int i = 0; i < e; i++) {
			st = new StringTokenizer(br.readLine());
			
			row = Integer.parseInt(st.nextToken());
			col = Integer.parseInt(st.nextToken());
			
			graph[row][col] = 1;
			graph[col][row] = 1;
			
		}
		
		for(int i = 1; i < v+1; i++) {
			if(visited[i] != 1) {
				dfs(i);
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
	
	public static void dfs(int node) {
		
		visited[node] = 1;
		
		for(int i = 1; i<v+1; i++) {
			//System.out.println(node + " " + i +" " + graph[node][i] + visited[node]);
			if(graph[node][i] == 1 && visited[i] == 0) {
				//System.out.println("yes");
				dfs(i);
			}
		}
	}

}