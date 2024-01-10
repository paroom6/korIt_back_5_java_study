package com.study.ch16;

public class ArrayMain {
    public static void main(String[] args) {
        String[] initStrArray = new String[0];
        ArrayService arrayService = new ArrayService(initStrArray);
        arrayService.add("조성민");
        arrayService.add("조성이");
        arrayService.add("조성삼");
        arrayService.add("조성사");
        arrayService.add("조성오");
        System.out.println(arrayService.toString());
        System.out.println(arrayService.indexOf("조성오"));
        arrayService.remove(0);
        System.out.println(arrayService.toString());

        System.out.println(arrayService.get(0));

    }
}
