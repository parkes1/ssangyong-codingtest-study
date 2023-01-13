package my.dayp9.b.array;

import java.util.Random;

public class lotto_rw {

	public static void main(String[] args) {
		//1부터 45까지의 숫자 중 랜덤하게 6개의 숫자를 추출하도록 한다.
		
		//길이가 44개인 배열을 선언
		
		int[] ballArr = new int[45];
		for(int i=0; i<ballArr.length; i++) {
			ballArr[i] = i+1;
		}//i = 0 이므로 일을 더해준값을 초기값으로 설정 
		System.out.println(ballArr[4]);
		//배열의 길이가 6개인 배열 선언
		int[] tempArr = new int[5];
		for(int i=0; i<tempArr.length; i++) {
			tempArr[i] = -1; 
		}// 겹치기 방지를위해 음수를 초기값으로 설정
		
		//랜덤번호 발생 
		
		Random rnd = new Random();
		String result ="";
		outer:
		for(int i=0; i<6; i++) {
			int idx = rnd.nextInt(44-0+1)+0; //0~44
			
			//중복숫자를 만들지 않기위한 이중 for문
			for(int j=0; j<tempArr.length; j++) {
				if(idx == tempArr[j]) {
					i--;
					continue outer;
				}
			}
			if(i<5) {
				tempArr[i] = idx; // 랜덤으로 돌린 숫자가 tempArr에 저장되어짐
			}
			String str_add = (i<5)?",":"";
			result+=ballArr[idx]+str_add;
		}//end of for
		
		System.out.println("\n로또 1등 당첨번호: " + result);

	}

}
