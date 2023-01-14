package my.day8.a.quiz;

public class Day8_QuizMain2 {
	/*


	== 입사문제 == 

	*********1
	********2
	*******3
	******4
	*****5
	****6
	***7
	**8
	*9

	위와같이 나오도록 하세요.
	1. for 문을 사용해서 출력
	2. while 문을 사용해서 출력
	3. do~while 문을 사용해서 출력
	
	*/
	

	public static void main(String[] args) {
		//1.for문을 이용하여 출력 
	    
		for(int i=1; i<=9; i++) {
			for(int j=10; j>i; j--) {
				System.out.print("*");
			}
			System.out.println(""+i);
		}
		
		//2.while문을 이용하여 출력 
		
		int i = 1;
	    
		while(i <= 9) {
			int j= 9;
			while(j >= i) {
				System.out.print("*");
				j--;
			}
			System.out.println(""+i);
			i++;
		}
		System.out.println("=========================");
		//3.do-while문을 이용하여 출력하기
		
		 i=1;
		 int j=0;
		 do {
			 j = 9;
			 do {
				 System.out.print("*");
				 j--;
			 } while(i <= j);
				System.out.println(""+i);
				i++;
		 }while(i<10);
		 		
		
	}// end of main

}
