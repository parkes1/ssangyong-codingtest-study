걸린 시간 : 27분
레벨 : LV 1


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
	public static String result = "";
	
    public int solution(String s) {
        int answer;
		String tmp = "";
		for(int i = 0; i < s.length(); i++) {
			if(48 <= s.charAt(i) && s.charAt(i) <= 89) {
				result += s.charAt(i);
				continue;
			}
			
			tmp += s.charAt(i);
			
			if(compareString(tmp)) {
				tmp = "";
			}
		}
		
		answer = Integer.parseInt(result);
		return answer;
    }
    
	public static boolean compareString(String inputStr) {
		switch(inputStr) {
		
		case "zero" :
			result += '0';
			return true;
			
		case "one" :
			result += '1';
			return true;
			
		case "two" :
			result += '2';
			return true;
			
		case "three" :
			result += '3';
			return true;
			
		case "four" :
			result += '4';
			return true;
			
		case "five" :
			result += '5';
			return true;
			
		case "six" :
			result += '6';
			return true;
			
		case "seven" :
			result += '7';
			return true;
			
		case "eight" :
			result += '8';
			return true;
			
		case "nine" :
			result += '9';
			return true;
			
		default :
			return false;
		}

	}
}