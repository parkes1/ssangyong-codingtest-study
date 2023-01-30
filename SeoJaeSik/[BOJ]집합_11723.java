import java.util.HashSet;
import java.util.Scanner;

public class BOJ_11723 {
	// 백준 11723번
	// all 과 empty NumberFormat e 에러...
	HashSet<Integer> S = new HashSet <>();

	
	void add (int x) { 
		S.add(x);
	}
	void remove (int x) {
		S.remove(x);
	}
	void check (int x) {
		if (S.contains(x)) {
			System.out.println("1");
		}
		else {
			System.out.println("0");

		}
	}
	void toggle (int x) {
		if (S.contains(x)) {
			S.remove(x);
		}
		else S.add(x);
	}
	void all () {
		for (int i=1; i<=20; i++) {
			S.add(i);
		}
	}
	void empty () {
		S.clear();
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int M = Integer.parseInt(sc.nextLine());
		BOJ_11723 set = new BOJ_11723();
		
		for (int i=0; i<M; i++) {
			String command = sc.nextLine();
			int temp = Integer.parseInt(command.replaceAll("[^0-9]", ""));
		
			if (command.contains("add")) {
				set.add(temp);
			}
			else if (command.contains("check")) {
				set.check(temp);
			}
			
			else if (command.contains("remove")) {
				set.remove(temp);
			}
			else if (command.contains("empty")) {
				set.empty();
			}
			else if (command.contains("all")) {
				set.all();
			}
			else if (command.contains("toggle")) {
				set.toggle(temp);
			}
			
			
		}
		
		sc.close();
	}

}
