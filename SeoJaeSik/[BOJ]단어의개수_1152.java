package a.BOJ;

import java.util.Scanner;

public class BOJ_1152 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String answer = sc.nextLine();
		String [] temp = answer.split(" ");
		
		
		if (answer.trim().isEmpty() == true) {
			System.out.println(0);
			// 공백만 입력했을 경우 단어의 개수는 0이므로 0출력
		}
		else if (answer.indexOf(" ") == 0 || answer.lastIndexOf(" ") == 0 && answer.length() > 0 ) {
			System.out.println(temp.length-1);
			// 공백이 처음이나 마지막에 존재할경우 단어의 개수는 동일하지만 배열의 크기는 커지므로 -1
		}  
		else {
			System.out.println(temp.length);
		}
		
		sc.close();
	}

}
