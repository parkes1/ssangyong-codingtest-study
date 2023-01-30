걸린 시간 : 20분
레벨 : LV 0

class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        
        int my_str_length = my_str.length();
        
        int answerSize = my_str_length / n;
        
        if((my_str_length % n) != 0) {
        	answerSize = answerSize+1;
        }
        
        answer = new String[answerSize];
        
        for(int i = 0; i < answerSize; i++) {
            
            if(i == answerSize - 1) {
                answer[i] = my_str.substring(0);
                break;
            }
            
        	answer[i] = my_str.substring(0, n);
            
        	if(my_str.length() != 0) {
            	my_str = my_str.substring(n);
        	}
        }
        
        return answer;
    }
}