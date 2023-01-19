걸린 시간 : 178분
레벨 : 골드 4

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;



public class Main {

	public static int n, m;
	public static int[] remoteButton = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}; // 인덱스별로 리모컨 버튼의 작동 유무 표시 1은 작동 0은 고장
	public static int length;
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer st;
		
		String str_n = br.readLine();
		n = Integer.parseInt(str_n);
		m = Integer.parseInt(br.readLine());
		
		if(m != 0) { 
			st = new StringTokenizer(br.readLine());
			for(int i=0; i<m; i++) {
				int button = Integer.parseInt(st.nextToken());
				remoteButton[button] = 0;                           // 고장 난 버튼 0 기입
			}
		}
		
		int result = Math.abs(n-100);                                // 대략적인 초기값 설정 처음 채널이 100이기 때문에 -100
		
		for(int j = 0; j <= 999999; j++) {								// 완전 탐색문제, 50만^2 은 빅오의 n^2 초과라서 시간제한 2초를 넘김 따라서 그냥 다 계산하는게 유리
			if(isAns(j)) {
				int min = Math.abs(n-j) + length;					// 목표값 n에서 j를 빼고 절대값으로 바꾸면 + = 버튼 누른 횟수가 됨 
																	//	## [주의] 길이를 목표 채널의 길이로 해서 문제를 오랫동안 틀렸음 ###
				result = Math.min(result, min);
			}
		}
		
		System.out.println(result);

	}
	

	
	public static boolean isAns(int tmp) {
		String str = Integer.toString(tmp);
		length = str.length();
		for(int i=0; i<str.length(); i++) {
			if( (remoteButton[(str.charAt(i) - '0')] != 1 ) ) {
				return false;
			}
		}
		return true;
	}
}