package com.study.ch17;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class HashSetMain {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("조성민");
        nameList.add("조성민");
        nameList.add("조성이");
        nameList.add("조성이");
        nameList.add("조성삼");
        nameList.add("조성사");
        names.add("조성민"); //첫데이터를 기준으로 데이터 .                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  분리
        names.add("조성이");//중복이 안되기 때문에 중복을 제거하는 용도로 사용가능
        names.addAll(nameList);
        System.out.println(names);
        ArrayList<String> newNameList = new ArrayList<>();
        newNameList.addAll(names);
        nameList = newNameList;

        System.out.println(nameList);
        System.out.println(Objects.hash("조성민"));
        System.out.println(Objects.hash("조성이"));
        System.out.println(Objects.hash("조성삼"));
        System.out.println(Objects.hash("조성사"));
        String findname = null;
        for (String name : names) { // 인덱스를 통해 출력할 수 없기 때문에 foreach로 출력해야만한다
            if (name.equals("조성삼")){
                findname = name;
                break;
            }
        }
        System.out.println(findname);
        HashSet<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);

        nums.add(17);

        for (int x : nums) {
            System.out.print(x + " ");
        }

    }
}
