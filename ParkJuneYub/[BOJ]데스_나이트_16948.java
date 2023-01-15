걸린 시간 : 61분
레벨 : 실버 1


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class xy{ 		// 좌표이기 때문에 xy가 구현된 클래스를 하나 만들어준다.
	int x;
	int y;
	
	public xy(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Main {

	static int n;
	static int r1, c1, r2, c2;
	static int[][] arr;
	static int[][] visited;
	
	static int[] dx = {-2, -2, 0, 0, 2, 2};
	static int[] dy = {-1, 1, -2, 2, -1, 1};
	static Queue<xy> queue = new LinkedList<>();
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer st;
		
		n = Integer.parseInt(br.readLine());
		visited = new int[n][n];
		st = new StringTokenizer(br.readLine());
		
		r1 = Integer.parseInt(st.nextToken());
		c1 = Integer.parseInt(st.nextToken());
		r2 = Integer.parseInt(st.nextToken());
		c2 = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				visited[i][j] = 0;
			}
		}
		
		int ans = 0;						
		visited[c1][r1] = 1;
		queue.offer(new xy(r1, c1)); 		// queue에 객체를 집어넣는 메서드 offer, add
		boolean flag = false;
		
		while(!queue.isEmpty()) {
			int sz = queue.size(); 			// 큐를 구현하는데 최단거리를 어떻게 구해야 할까? => 그래프의 레벨을 구하기 위해서 미리 큐의 사이즈를 정하고 그만큼 돌면 ans를 1씩 증가시킨다. 
			
			for(int s = 0; s < sz; s++) {
				int x = queue.peek().x;
				int y = queue.peek().y;
				queue.poll();				// peek은 헤드의 값만 주기때문에 헤드의 값을 없애줘야 한다.
				
				if(x == r2 && y == c2) {
					System.out.println(ans);
					flag = true;
				}
				
				for(int i = 0; i < 6; i++) {
					int nx = x+dx[i];
					int ny = y+dy[i];
					if(nx < 0 || nx >= n || ny < 0 || ny >= n ) {
						continue;
					}
					if(visited[ny][nx] == 1) {		// 방문한 좌표는 넘긴다.
						continue;
					}
					visited[ny][nx] = 1;
					queue.offer(new xy(nx, ny));
					
				}
			}
			ans++;
		}
		if(!flag) {
			System.out.println(-1);
		}
	}
}
