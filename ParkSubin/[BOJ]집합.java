import java.io.*;
import java.util.*;

/**
 * 집합 (시간초과)
 * https://www.acmicpc.net/problem/11723
 *
 * 푼 날짜 : 230125
 * 걸린 시간 :
 */

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            if (!str.contains(" ")) {
                set.clear();
                if (str.contains("all")) {
                    for (int j = 1; j <= 20; j++) {
                        set.add(j);
                    }
                }
                continue;
            }

            int num = Integer.parseInt(str.split(" ")[1]);
            if (str.contains("add")) {
                set.add(num);
            } else if (str.contains("remove")) {
                set.remove(num);
            } else if (str.contains("check")) {
                if (set.contains(num)) System.out.println(1);
                else System.out.println(0);
            } else { // toggle
                if (set.contains(num)) set.remove(num);
                else set.add(num);
            }
        }
    }

}