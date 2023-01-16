package my.day07.quiz.For;

import java.util.Scanner;

public class Quiz3_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("휴대폰 번호를 입력하세요 예> 010-2345-5678: ");
		String str = sc.nextLine();
		
		for(int i=0; i < str.length(); i++) {
			String match = "[^\uAC00-\uD7A30-9a-zA-Z]";
			str = str.replaceAll(match, "");
		}
		
		System.out.println(str);
		sc.close();

	}

}


