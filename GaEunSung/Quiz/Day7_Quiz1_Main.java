package my.day07.quiz.For;

import java.util.Scanner;

public class Quiz1_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("▷문자열을 입력하세요 :");
		String str = sc.nextLine();

		int upp = 0, low = 0, num = 0, spec = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch_1 = str.charAt(i);
			if ('A' <= ch_1 && ch_1 <= 'Z') {
				upp++; // 대문자 판별
			} else if ('a' <= ch_1 && ch_1 <= 'z') {
				low++;// 소문자 판별
			} else if ('0' <= ch_1 && ch_1 <= '9') {
				num++; //숫자 판별
			} else {
				spec++; // 특수문자 판별
			}// end of if(문자열 판별기)
		}//end of for ---------
		  
		 System.out.println("입력한 문자열 :" + str +"\n"
				  		   + "입력한 문자열 길이 :" + str.length() +"\n"
				  		   +"대문자 개수 :" + upp +"\n"
				  		   + "소문자 갯수 :" + low +"\n"
				  		   + "숫자 갯수 :" + num +"\n"
				  		   + "특수 문자 갯수 :" + spec +"\n"
		  
		 );
		 
		 sc.close();
		 
	}//end of main()------

}
