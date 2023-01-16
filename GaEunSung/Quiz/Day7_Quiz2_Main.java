package my.day07.quiz.For;

public class Quiz2_Main {

	public static void main(String[] args) {
		char ch = 'a';
		
		for(int i=0; i<'z'-'a'+1; i++) {
			if( i%2 == 0) {
				ch = Character.toUpperCase(ch);
			}
			else {
				ch =Character.toLowerCase(ch);
			}
			String str = ((i+1)%26 == 0)?"\n":","; // 마지막에 소수점 나오는거 지우기
			System.out.print(ch++ + str);
		}// end of for 
		System.out.println("\n");


	}

}
