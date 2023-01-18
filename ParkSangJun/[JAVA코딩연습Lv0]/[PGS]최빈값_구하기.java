class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int arrayMax =0; // 배열 안의 값중 가장큰값

        for(int i=0; i<array.length; i++){
            if(array[i]>arrayMax){
                arrayMax=array[i];
            }
        }//배열 안의 값중 가장큰값 찾고 arrayMax에 넣기
        
        int [] count = new int [arrayMax+1];// count배열 길이 설정 why +1? 배열은 0부터 시작하므로 +1 을해줘야 최대값이 같은값의 배열에 들어감

        for(int j=0; j<array.length; j++){
            count[array[j]]++;
        }// array[j]의 값과 같은 count 배열안에 넣기

        int countMax = 0;
        for(int k=0; k<count.length; k++){
            if(count[k]>countMax){
                countMax = count[k];

                answer = k;
            }
        }// array배열안에 중복된 값이 있을경우 count배열의 index값이 오름 따라서 count배열의 최대 index값을 찾기 그 해당 count[k]의 k값이 답 

        int jungbog = 0;
        for(int m=0; m<count.length; m++){
            if(countMax==count[m]){
                jungbog ++;
            }
        }// coutMax값을 찾던 중 만약 동일한 countMax가 있는 경우를 찾는법

        if (jungbog!=1){
            answer = -1;
        }// jungbog이 1이 아닌경우 -1을 도출해내기 위한 법

        return answer;
    }
}