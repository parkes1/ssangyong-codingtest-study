package study;
//[BOJ]단어의개수_1152

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String[] strArr = str.trim().split(" ");
		int answer = strArr.length;
		
		if(str.trim().isEmpty()) {
			answer = 0;
		}

		
		
		System.out.println(answer);
		
	}//end of main

}