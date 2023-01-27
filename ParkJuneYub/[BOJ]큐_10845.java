걸린 시간 : 38분
레벨 : 실버 4

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;



public class Main {


	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		Queue<Integer> queue = new LinkedList<>();
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int last = 0;
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			String msg = st.nextToken();
			
			switch(msg) {
				case "push" : {
					int j = Integer.parseInt(st.nextToken());
					queue.offer(j);
					last = j;
					break;
				}
				case "front" : {
					if(queue.isEmpty()) {
						sb.append("-1").append("\n");
						break;
					} else {
						sb.append(queue.peek()).append("\n");
						break;
					}

				}
				case "back" : {
					if(queue.isEmpty()) {
						sb.append("-1").append("\n");
						break;
					} else {
						sb.append(last).append("\n");
						break;
					}


				}
				
				case "pop" : {
					if(queue.isEmpty()) {
						sb.append("-1").append("\n");
						break;
					} else {
						sb.append(queue.poll()).append("\n");
						break;
					}

				}
				
				case "size" : {
					sb.append(queue.size()).append("\n");
					break;
				}
				
				case "empty" : { 
					if(queue.isEmpty()) {
						sb.append("1").append("\n");
					} else {
						sb.append("0").append("\n");
					}
				}
				
				
			}
		}
		System.out.println(sb.toString());
		
		
	}
}