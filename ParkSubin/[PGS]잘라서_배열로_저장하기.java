import java.util.Arrays;

/**
 * 잘라서 배열로 저장하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120913
 *
 * 푼 날짜 : 230125
 * 걸린 시간 : 15분
 */

public class Main {

    public static String[] solution(String my_str, int n) {
        int div = my_str.length() / n;
        int size = div;
        if (my_str.length() % n != 0) {
            size = div + 1;
        }
        String[] answer = new String[size];

        int i = 0;
        while (i < div) {
            answer[i++] = my_str.substring(0, n);
            my_str = my_str.substring(n);
        }
        if (my_str.length() > 0) {
            answer[i] = my_str;
        }

        return answer;
    }

    public static void main(String[] args) {
        String my_str = "abc1Addfggg4556b";
        int n = 6;

        System.out.println(Arrays.toString(solution(my_str, n)));
    }

}