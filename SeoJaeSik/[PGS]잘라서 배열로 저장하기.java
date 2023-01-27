public class ex_11 {
	
	
	public static String [] solution (String my_str , int n) {
		
		int num ;
		if (my_str.length() % n == 0) {
			num = my_str.length()/n;
		}
		else {
			num = my_str.length()/n + 1;		
		}
		String [] answer = {};
		answer = new String [num];
	
	
		for (int i=0; i<num; i++) {
			if (i==0) {
				answer[i] = my_str.substring(0, n);
			}
			else if (i== num-1) {
				answer[i] = my_str.substring(i*n,my_str.length());
			}
			else {
				answer[i] = my_str.substring(i*n, (i+1)*n);
			}
			
		}
		
		return answer;
	}
}