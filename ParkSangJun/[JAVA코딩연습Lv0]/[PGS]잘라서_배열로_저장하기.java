class Solution {
    public String[] solution(String my_str, int n) {
        int cnt = 0;
		
		if(my_str.length()%n != 0) {
			cnt = my_str.length()/n+1;
		}
		else {
			cnt = my_str.length()/n;
		}
		
		String[] answer = new String [cnt];
		
	
		
		for(int i=0; i<cnt; i++) {
			
			if(i==cnt-1) {
				answer[i] = my_str.substring(i*n, my_str.length());
				}
			else {
				answer[i] = my_str.substring(i*n, i*n+n);
			}
			
			}
        
        
        return answer;
    }
}