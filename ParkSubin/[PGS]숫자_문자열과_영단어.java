/**
 * [PGS] 숫자 문자열과 영단어 - 레벨 1 (2021 카카오 채용연계형 인턴십)
 * https://school.programmers.co.kr/learn/courses/30/lessons/81301?language=java
 *
 * 푼 날짜 : 230113
 * 걸린 시간 : 15분
 */

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static int solution(String s) {
        Map<String, Integer> map = new HashMap<String, Integer>() {{
            put("zero", 0);
            put("one", 1);
            put("two", 2);
            put("three", 3);
            put("four", 4);
            put("five", 5);
            put("six", 6);
            put("seven", 7);
            put("eight", 8);
            put("nine", 9);
        }};

        for (String key : map.keySet()) {
            s = s.replaceAll(key, map.get(key).toString());
        }

        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        String s = "one4seveneight";
        String s2 = "23four5six7";
        String s3 = "2three45sixseven";
        String s4 = "123";
        System.out.println(solution(s));
        System.out.println(solution(s2));
        System.out.println(solution(s3));
        System.out.println(solution(s4));
    }
}