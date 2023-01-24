import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        
       Arrays.sort(array);
        
       
        
        return array[array.length/2];
    }
}

// Array.sort 기능을 배움.
// 단 사용할때 import java.util.Arrays; 를 필히 사용할것.
//추후에 Array.sort를 사용하지 않고 하는법 생각해봐야할듯 여러번실패함