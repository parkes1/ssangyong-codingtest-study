import java.util.Scanner;

public class BOJ_10872 {
	
	public static int factorial(int n) {
		
		if (n==0 || n==1) {
			return 1;
		}
		else {
			return n * factorial(n-1);
		}
	}

	public static void main(String[] args) {
		// 반복문이 아닌 재귀함수 사용해 팩토리얼 구현하기
		Scanner sc = new Scanner (System.in);
		int answer = Integer.parseInt(sc.nextLine());
		System.out.println(factorial(answer));
		sc.close();
	}

}
