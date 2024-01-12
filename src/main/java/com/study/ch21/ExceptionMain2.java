package com.study.ch21;

import java.util.ArrayList;
import java.util.List;

public class ExceptionMain2 {

    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("조성민");
        nameList.add("조성이");
        nameList.add(null);
        nameList.add("조성사");
        try {
            for (int i = 0; i < 5; i++) {
                String name = nameList.get(i);
                if(name.equals("조성사")){
                    System.out.println("조정사를 찾음!!!");
                    break;
                }
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
