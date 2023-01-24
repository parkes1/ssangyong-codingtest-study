
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int E = sc.nextInt();
		int S = sc.nextInt();
		int M = sc.nextInt();
		
		int Y=0;
		
		while(true) {
			Y++;
            if((Y-E)%15==0 && (Y-S)%28==0 && (Y-M)%19==0)
                break;
				
		}	
		
		System.out.println(Y);
				

	}

}