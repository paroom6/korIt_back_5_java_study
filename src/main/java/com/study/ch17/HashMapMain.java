package com.study.ch17;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMain {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("1번학생","조성민");
        map.put("2번학생","조성이");
        map.put("3번학생","조성삼");
        map.put("4번학생","조성사");
        System.out.println(map);
        System.out.println(map.get("3번학생"));

        Set<String> setKey = map.keySet();
        for (String s : setKey) {
            System.out.println(s);
        }
        map.forEach((k, v) -> { //향상된 for문을 사용해서 반복할 때는 엔트리를 사용해서 키와 값을 묶은 앤트리를 사용해 반복한다
            System.out.println("key: " + k);
            System.out.println("value: " + v);
        });
    }
}
