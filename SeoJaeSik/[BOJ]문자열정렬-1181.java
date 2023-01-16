import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ex1181 {

	public static void main(String[] args) {
		//백준  1181번
		
//		알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
//		길이가 짧은 것부터 길이가 같으면 사전 순으로 동일한 문자는 1번만 출력
		
//    	중복제거는 하지못함…
		
		Scanner sc = new Scanner (System.in);
		int N = Integer.parseInt(sc.nextLine());
		String [] list = new String [N];
		
		for (int i=0; i<N; i++) {     // 문자열 배열 입력받기
			list[i] = sc.nextLine();
		}
		
		Arrays.sort(list);   // 사전순으로 정렬
		
		Comparator <String> comparator = new Comparator <String> () {  //comparator 객체를 만들
			public int compare (String s1, String s2) {                //compare 오버라이딩
				return s1.length() - s2.length();                      //문자열 길이 비교후 리턴
			}
		};
		
		Arrays.sort(list,comparator);
		
		for (int j=0; j<N; j++) {
			System.out.println(list[j]);
		}
		
		sc.close();
	}


}
