package com.study.Test;

import java.util.Arrays;
import java.util.List;

class SubjectSurvice {
    private List<String> subjects;

    public  SubjectSurvice(List<String> subjects) {
        this.subjects = subjects;
    }

    public void showSubjects() {
        int length = subjects.size();
        for (int i = 0; i < length; i++) {
            System.out.println(subjects.get(i));
        }
    }
}

public class Main1 {
    public static void main(String[] args) {
        List<String> subjects = Arrays.asList(new String[]{"C", "Java", "Python"});
        SubjectSurvice subjectSurvice = new SubjectSurvice(subjects);
        subjectSurvice.showSubjects();
    }
}
