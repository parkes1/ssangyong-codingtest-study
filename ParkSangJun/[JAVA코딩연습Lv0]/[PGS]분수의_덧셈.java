class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
       int a = numer1 * denom2 + numer2 * denom1;
       int b = denom1 * denom2;
       int max = 0;
        
       for(int i=1; i<=a&&i<=b; i++){
           if(a%i==0&&b%i==0){              
              max = i;              
           }
          
       }
        
        int[] answer = {a/max,b/max};
        
        return answer;
    }
}
/*
------------------------------내가 생각했던 방식---------------------------
class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] result = new int[2];
        // 분모의 최소공배수를 구한다.
        result[0] = denum1*num2 + denum2*num1;
        result[1] = num1*num2;
        int min = (result[0] > result[1])? result[0]: result[1];
        int gcd = 0;
        for (int i = 1; i <= min; i++) {
            if (result[0] % i == 0 && result[1] % i == 0)
                gcd = i;
        }
        result[0] = result[0]/gcd;
        result[1] = result[1]/gcd;

        return result;
    }
}

*/