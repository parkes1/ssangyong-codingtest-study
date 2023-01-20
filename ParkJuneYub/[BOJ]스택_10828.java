걸린 시간 : 10분
레벨 : 실버 4


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;



public class Main {


	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		Stack<Integer> stack = new Stack<Integer>();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String msg = st.nextToken();
			switch(msg) {
			case "push" :
				int num = Integer.parseInt(st.nextToken());
				stack.push(num);
				break;
			
			case "top" :
				
				if(!stack.isEmpty()) {
					sb.append(stack.peek()).append("\n");
				} 
				else {
					sb.append(-1).append("\n");
				}
				break;
			
			case "pop" :
				if(!stack.isEmpty()) {
					sb.append(stack.pop()).append("\n");
				} 
				else {
					sb.append(-1).append("\n");
				}
				break;
			
			case "size" :
				sb.append(stack.size()).append("\n");
				break;
			
			case "empty" :
				if(stack.isEmpty()) {
					sb.append(1).append("\n");
				}
				else {
					sb.append(0).append("\n");
				}
				break;
			}
		} // end of for ------------------------------
		
		System.out.println(sb);
	}
}
