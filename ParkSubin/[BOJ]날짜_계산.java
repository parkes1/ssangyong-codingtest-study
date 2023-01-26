import java.util.Scanner;

/**
 * 날짜 계산
 * https://www.acmicpc.net/problem/1476
 *
 * 푼 날짜 : 230125
 * 걸린 시간 : 15분
 */

public class Main {

    public static int solution(int e, int s, int m) {
        int cnt = 0;
        int i = 0;
        int j = 0;
        int k = 0;

        while (i != e || j != s || k != m) {
            cnt++;
            if (++i > 15) i = 1;
            if (++j > 28) j = 1;
            if (++k > 19) k = 1;
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int e = Integer.parseInt(in.next());
        int s = Integer.parseInt(in.next());
        int m = Integer.parseInt(in.next());
        System.out.println(solution(e, s, m));
    }

}