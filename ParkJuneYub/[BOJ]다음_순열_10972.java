걸린 시간 : 90분
레벨 : 실버 3

접근방법 :
	1. 배열에서 내림차순으로 이루어진 부분을 찾는다.
	2. 내림차순으로 이루어진 수 중 내림차순으로 이루어진 부분에 바로 앞 수(swapStartIdx-1)보다 다음으로 큰 수를 찾아 앞 수와 교환한다.
	3. 교환된 뒷 부분을 오름차순으로 바꾼다. 또는 뒷부분을 오름차순으로 바꾸고 교환해도 상관 없다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	static int n;
	static int[] inputArr;
	
	public static void findReverseSort(int[] arr) {
		boolean changeMaxIdx = true;
		int maxIdx = 0;
		
		xx:
		for(int i = 0; i < n; i++) {
			if(changeMaxIdx) {
				maxIdx = i;
			}
			for(int j = i+1; j < n; j++) {
				if(arr[i] < arr[j]) {
					changeMaxIdx = true;
					continue xx;
				}
				changeMaxIdx = false;
			}
		}
		
		if(maxIdx == 0) {
			System.out.println(-1);
		} 
		else {
			swap(maxIdx, arr);
		}
	}
	
	public static void swap(int swapStartIdx, int[] arr) {
		Arrays.sort(arr, swapStartIdx, n);
		for(int i = swapStartIdx; i < n; i++) {
			if(arr[swapStartIdx-1] < arr[i]) {
				int tmp = 0;
				tmp = arr[swapStartIdx-1];
				arr[swapStartIdx-1] = arr[i];
				arr[i] = tmp;
				break;
			}
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		inputArr = new int[n];
		
		for(int i = 0; i < n; i++) {
			inputArr[i] = Integer.parseInt(st.nextToken());
		}
		
		findReverseSort(inputArr);
	}
}