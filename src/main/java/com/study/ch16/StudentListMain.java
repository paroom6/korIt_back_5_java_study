package com.study.ch16;


import java.util.ArrayList;
import java.util.HashMap;

public class StudentListMain {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("조성민", 25));
        students.add(new Student("조성이", 23));
        students.add(new Student("조성삼", 26));
        students.add(new Student("조성사", 24));

        System.out.println(students);
        for (int i = 0; i < students.size(); i++) { //List의 경우 size() 사용
            Student student = students.get(i);
            student.setAge(student.getAge() + 1);
        }
        System.out.println(students);
        //향상된 for : ArrayList뿐만아니라 배열 set에서도 사용가능
        for (Student student : students) { //처음부터 끝까지 student에 각각의 항목을 담는다
            student.setAge(student.getAge() + 1);
        }
        //람다식
        students.forEach(student -> student.setAge(student.getAge() + 1));
        Student[] studentsArray = new Student[4];
        int i = 0;
        for (Student student : studentsArray) {
            studentsArray[i] = new Student("조성민", 23);
            i++;
        }

        for (Student student : studentsArray) {
            System.out.println(student);
        }

        //students.set(index, student) 인덱스번째 덮어쓰기
        //students.get(i) 변수가 아닌 값이다

        students.set(0, new Student("조성민", 25));

    }

}
