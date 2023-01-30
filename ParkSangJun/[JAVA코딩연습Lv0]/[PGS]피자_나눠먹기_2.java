class Solution {
    public int solution(int n) {
        int answer = 0;
        int pizza = 1;

      while(true){
        if(pizza*6%n!=0){
            pizza++;
        }
        else
            break;
      }
        answer = pizza;

        return answer;
    }
}