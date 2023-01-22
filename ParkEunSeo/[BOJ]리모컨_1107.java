package study;

import java.util.Scanner;

public class BOJ_1107 {
	
public static void main(String[] args)  {
		
        Scanner sc = new Scanner(System.in);
        
        int ch = sc.nextInt();
        int m = sc.nextInt();
        
        boolean[] broken = new boolean[10];
        for(int i = 0; i < m; i++) {
            int n = sc.nextInt();
            broken[n] = true; // true면 고장
        }
        
        int result = Math.abs(ch - 100); // 초기 채널은 100. 모든 리모콘의 숫자버튼이 고장났을 경우 +-버튼으로만이동 가능하도록 초기값을 설정.
       
        for(int i = 0; i < 1000000; i++) {
        	
            String str = String.valueOf(i);
            int len = str.length();
            
            boolean isBreak = false;
            
            for(int j = 0; j < len; j++) {
                if(broken[str.charAt(j) - '0']) { // 고장난 버튼을 눌러야 하면
                    isBreak = true; 
                    break;
                }
            }
            
            if(!isBreak) { // i를 누를때 고장난 버튼을 누르지 않는다면
                int min = Math.abs(ch - i) + len; // i를 누른 후(len) target까지 이동하는 횟수(target - i)
                result = Math.min(min, result);
            }
        }        
        System.out.println(result);
    }
	

}
