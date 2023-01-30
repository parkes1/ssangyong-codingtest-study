
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ_1152 {

	public static void main(String[] args) throws NumberFormatException {
		
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		
		word = word.trim();
		String[] word_arr = word.split(" ");
		
		if(word_arr[0]== " ") {
			System.out.println(word_arr.length -1);
		}
		else {
			System.out.println(word_arr.length);
		}
		
		
		sc.close();
	
		
		
		
		System.out.println("\n===============================\n");
		
		
		Scanner str = new Scanner(System.in);
		
		String s = str.nextLine();
		str.close();
		
		StringTokenizer st = new StringTokenizer(s, " ");
		
		System.out.println(st.countTokens());

	}

}
