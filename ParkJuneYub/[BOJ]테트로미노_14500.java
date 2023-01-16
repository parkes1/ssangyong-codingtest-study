걸린 시간 : 60분
레벨 : 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
	static int[][] arr;
	
	static int[][][] block = { // 19 4 4
			{
				{1, 1, 1, 1},
				{0, 0, 0, 0},
				{0, 0, 0, 0},
				{0, 0, 0, 0},
			},
			{
				{1, 0, 0, 0},
				{1, 0, 0, 0},
				{1, 0, 0, 0},
				{1, 0, 0, 0},
			},
			{
				{1, 1, 0, 0},
				{1, 1, 0, 0},
				{0, 0, 0, 0},
				{0, 0, 0, 0},
			},
			{
				{1, 0, 0, 0},
				{1, 0, 0, 0},
				{1, 1, 0, 0},
				{0, 0, 0, 0},
			},
			{
				{1, 1, 1, 0},
				{1, 0, 0, 0},
				{0, 0, 0, 0},
				{0, 0, 0, 0},
			},
			{
				{1, 1, 0, 0},
				{0, 1, 0, 0},
				{0, 1, 0, 0},
				{0, 0, 0, 0},
			},
			{
				{0, 0, 1, 0},
				{1, 1, 1, 0},
				{0, 0, 0, 0},
				{0, 0, 0, 0},
			},
			{
				{0, 1, 0, 0},
				{0, 1, 0, 0},
				{1, 1, 0, 0},
				{0, 0, 0, 0},
			},
			{
				{1, 0, 0, 0},
				{1, 1, 1, 0},
				{0, 0, 0, 0},
				{0, 0, 0, 0},
			},
			{
				{1, 1, 0, 0},
				{1, 0, 0, 0},
				{1, 0, 0, 0},
				{0, 0, 0, 0},
			},
			{
				{1, 1, 1, 0},
				{0, 0, 1, 0},
				{0, 0, 0, 0},
				{0, 0, 0, 0},
			},
			{
				{1, 0, 0, 0},
				{1, 1, 0, 0},
				{0, 1, 0, 0},
				{0, 0, 0, 0},
			},
			{
				{0, 1, 1, 0},
				{1, 1, 0, 0},
				{0, 0, 0, 0},
				{0, 0, 0, 0},
			},
			{
				{0, 1, 0, 0},
				{1, 1, 0, 0},
				{1, 0, 0, 0},
				{0, 0, 0, 0},
			},
			{
				{1, 1, 0, 0},
				{0, 1, 1, 0},
				{0, 0, 0, 0},
				{0, 0, 0, 0},
			},
			{
				{1, 1, 1, 0},
				{0, 1, 0, 0},
				{0, 0, 0, 0},
				{0, 0, 0, 0},
			},
			{
				{0, 1, 0, 0},
				{1, 1, 0, 0},
				{0, 1, 0, 0},
				{0, 0, 0, 0},
			},
			{
				{0, 1, 0, 0},
				{1, 1, 1, 0},
				{0, 0, 0, 0},
				{0, 0, 0, 0},
			},
			{
				{1, 0, 0, 0},
				{1, 1, 0, 0},
				{1, 0, 0, 0},
				{0, 0, 0, 0},
			},
			
	};
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n+3][m+3];
		
		for(int y = 0; y < n; y++) {  // 2차원 배열 받기
			st = new StringTokenizer(br.readLine());
			
			for(int x = 0; x < m; x++) {
				arr[y][x] = Integer.parseInt(st.nextToken()); 
			}
		}
		
		for(int y = n; y < n+3; y++) { // 받은 2차원 배열 아래로 +3, 오른쪽 +3 음수 넣기
			for(int x = m; x < m+3; x++) {
				arr[y][x] = -10000; 
			}
		}
		
		int result = 0;
		
		for(int y = 0; y < n; y++) {
			for(int x=0; x < m; x++) {
				result = Math.max(findMaxValue(x, y), result);
			}
		}
		
		System.out.print(result);
		
		
		
	}
	
	public static int findMaxValue(int x, int y) { // 테트로미노를 파라미터로 받은 x,y값에 맞춰 모두 조회해본다.
		int max = 0;
		int tmp = 0;
		
		for(int i = 0; i<19; i++) {
			for(int j = 0; j<4; j++) {
				for(int k = 0; k<4; k++) {
					if(block[i][j][k] == 1) {
						tmp += arr[y+j][x+k];
					}
				}
			}
			max = Math.max(max, tmp);
			tmp = 0;
		}
		return max;
		
	}


}