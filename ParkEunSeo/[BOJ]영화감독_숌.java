package study;

import java.util.Scanner;

public class BOJ_1436 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		
		int num = 666;
		int count = 1;
		
		while(count != m) {
			num++;
			if(String.valueOf(num).contains("666")) {
				count++;
			}
		}
		System.out.println(num);
	}

}







